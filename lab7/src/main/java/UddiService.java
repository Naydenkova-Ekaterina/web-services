import org.apache.juddi.v3.client.UDDIConstants;
import org.apache.juddi.v3.client.config.UDDIClerk;
import org.apache.juddi.v3.client.config.UDDIClient;
import org.apache.juddi.v3.client.transport.Transport;
import org.uddi.api_v3.*;
import org.uddi.v3_service.UDDIInquiryPortType;
import org.uddi.v3_service.UDDIPublicationPortType;
import org.uddi.v3_service.UDDISecurityPortType;

public class UddiService {

    private String domain_prefix = "uddi:mydomain.com:";
    private String lang = "en";
    private TModel keygen = null;
    private UDDISecurityPortType security = null;
    private UDDIInquiryPortType inquiry = null;
    private UDDIPublicationPortType publish = null;
    private UDDIClient client = null;
    private UDDIClerk clerk = null;

    public void register() {
        Init();
        Setup();
    }

    public void search() throws Exception {
        ServiceLookUpByName();
        Destroy();
    }

    private void Init() {
        try {
            client = new UDDIClient("META-INF/uddi.xml");
            clerk = client.getClerk("default");
            Transport transport = client.getTransport("default");
            security = transport.getUDDISecurityService();
            inquiry = transport.getUDDIInquiryService();
            publish = transport.getUDDIPublishService();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void Setup() {
        BusinessEntity be = new BusinessEntity();
        keygen = clerk.register(UDDIClerk.createKeyGenator(domain_prefix + "keygenerator", "my domain", lang)).getTModel().get(0);
        be.setBusinessServices(new BusinessServices());
        be.setBusinessKey(domain_prefix + "zerocoolbiz");
        be.getName().add(new Name("ZeroCool Business", lang));
        BusinessService bs = new BusinessService();
        bs.getName().add(new Name("ZeroCool Service", lang));
        bs.setBindingTemplates(new BindingTemplates());
        bs.setBusinessKey(domain_prefix + "zerocoolbiz");
        bs.setServiceKey(domain_prefix + "zerocoolsvc");

        BindingTemplate bt1 = new BindingTemplate();
        String version = "1.0.0.0";
        bt1.setBindingKey(domain_prefix + "binding10");
        bt1.setAccessPoint(new AccessPoint("http://localhost", "wsdl"));
        bt1.setTModelInstanceDetails(new TModelInstanceDetails());
        bt1.getTModelInstanceDetails().getTModelInstanceInfo().add(UDDIClerk.createServiceInterfaceVersion(version, lang));
        bt1 = UDDIClient.addSOAPtModels(bt1);
        bs.getBindingTemplates().getBindingTemplate().add(bt1);
        be.getBusinessServices().getBusinessService().add(bs);
        clerk.register(be);
    }

    private void ServiceLookUpByName() throws Exception {

        FindService fs = new FindService();
        fs.setFindQualifiers(new FindQualifiers());
        fs.getFindQualifiers().getFindQualifier().add(UDDIConstants.EXACT_MATCH);
        fs.getName().add(new Name("ZeroCool Service", lang));
        ServiceList findService = inquiry.findService(fs);

        GetServiceDetail gsd = new GetServiceDetail();
        for (int i = 0; i < findService.getServiceInfos().getServiceInfo().size(); i++) {
            gsd.getServiceKey().add(findService.getServiceInfos().getServiceInfo().get(i).getServiceKey());
        }
        ServiceDetail serviceDetail = inquiry.getServiceDetail(gsd);

        BusinessService bs = serviceDetail.getBusinessService().get(0);
        System.out.println(bs.getName());
        System.out.println(bs.getDescription());
    }

    private void Destroy() {
        clerk.unRegisterBusiness(domain_prefix + "zerocoolbiz");
        clerk.unRegisterTModel(keygen.getTModelKey());
        clerk.discardAuthToken();
    }

}
