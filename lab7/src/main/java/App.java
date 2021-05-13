import java.util.Scanner;

public class App {

    private static UddiService uddiService = new UddiService();

    public static void main(String[] args) throws Exception {
        System.out.println("Команды: 1) register 2) search 3) exit");
        System.out.println("Введите команду:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            switch (command) {
                case "register":
                    registerService();
                    break;
                case "search":
                    searchService();
                    break;
                case "exit":
                    System.exit(60);
                default:
                    System.out.println("Команды: 1) register 2) search 3) exit");
                    break;
            }
        }
    }

    public static void registerService() {
        uddiService.register();
    }

    public static void searchService() throws Exception {
        uddiService.search();
    }

}
