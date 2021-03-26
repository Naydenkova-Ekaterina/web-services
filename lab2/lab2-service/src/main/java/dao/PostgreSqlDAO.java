package dao;

import model.Student;
import util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostgreSqlDAO {

    // CRUD - lab 2
    public Long createStudent(String name, String surname, int age, String groupNumber, String faculty) {
        Long id = null;
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("insert into students(name, surname, age, groupNumber, faculty) values (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setInt(3, age);
            stmt.setString(4, groupNumber);
            stmt.setString(5, faculty);

            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getLong("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public boolean updateStudent(Long id, String name, String surname, int age, String groupNumber, String faculty) {
        boolean result = false;
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("update students set name = ?, surname = ?, age = ?, groupNumber = ?, faculty = ? where id = ?");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setInt(3, age);
            stmt.setString(4, groupNumber);
            stmt.setString(5, faculty);
            stmt.setLong(6, id);

            stmt.execute();
            result = stmt.getUpdateCount() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public boolean deleteStudent(Long id) {
        boolean result = false;
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("delete from students where id = ?");
            stmt.setLong(1, id);
            stmt.execute();
            result = stmt.getUpdateCount() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // Lab 1
    public List<Student> getStudentsByName(String name) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ?");
            stmt.setString(1, name);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsBySurname(String surname) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where surname = ?");
            stmt.setString(1, surname);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByAge(int age) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where age = ?");
            stmt.setInt(1, age);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByGroupNumber(String groupNumber) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where groupNumber = ?");
            stmt.setString(1, groupNumber);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByFaculty(String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where faculty = ?");
            stmt.setString(1, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByNameAndSurname(String name, String surname) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ? and surname = ?");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByNameAndAge(String name, int age) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ? and age = ?");
            stmt.setString(1, name);
            stmt.setInt(2, age);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByNameAndGroupNumber(String name, String groupNumber) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ? and groupNumber = ?");
            stmt.setString(1, name);
            stmt.setString(2, groupNumber);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByNameAndFaculty(String name, String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ? and faculty = ?");
            stmt.setString(1, name);
            stmt.setString(2, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsBySurnameAndAge(String surname, int age) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where surname = ? and age = ?");
            stmt.setString(1, surname);
            stmt.setInt(2, age);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsBySurnameAndGroupNumber(String surname, String groupNumber) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where surname = ? and groupNumber = ?");
            stmt.setString(1, surname);
            stmt.setString(2, groupNumber);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsBySurnameAndFaculty(String surname, String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where surname = ? and faculty = ?");
            stmt.setString(1, surname);
            stmt.setString(2, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByAgeAndGroupNumber(int age, String groupNumber) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where age = ? and groupNumber = ?");
            stmt.setInt(1, age);
            stmt.setString(2, groupNumber);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByAgeAndFaculty(int age, String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where age = ? and faculty = ?");
            stmt.setInt(1, age);
            stmt.setString(2, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByGroupNumberAndFaculty(String groupNumber, String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where groupNumber = ? and faculty = ?");
            stmt.setString(1, groupNumber);
            stmt.setString(2, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByNameAndSurnameAndAge(String name, String surname, int age) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ? and surname = ? and age = ?");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setInt(3, age);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByNameAndSurnameAndGroupNumber(String name, String surname, String groupNumber) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ? and surname = ? and groupNumber = ?");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setString(3, groupNumber);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByNameAndSurnameAndFaculty(String name, String surname, String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ? and surname = ? and faculty = ?");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setString(3, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsBySurnameAndAgeAndGroupNumber(String surname, int age, String groupNumber) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where surname = ? and age = ? and groupNumber = ?");
            stmt.setString(1, surname);
            stmt.setInt(2, age);
            stmt.setString(3, groupNumber);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsBySurnameAndAgeAndFaculty(String surname, int age, String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where surname = ? and age = ? and faculty = ?");
            stmt.setString(1, surname);
            stmt.setInt(2, age);
            stmt.setString(3, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByAgeAndGroupNumberAndFaculty(int age, String groupNumber, String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where age = ? and groupNumber = ? and faculty = ?");
            stmt.setInt(1, age);
            stmt.setString(2, groupNumber);
            stmt.setString(3, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByNameAndSurnameAndAgeAndGroupNumber(String name, String surname, int age, String groupNumber) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ? and surname = ? and age = ? and groupNumber = ?");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setInt(3, age);
            stmt.setString(4, groupNumber);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByNameAndSurnameAndAgeAndFaculty(String name, String surname, int age, String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ? and surname = ? and age = ? and faculty = ?");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setInt(3, age);
            stmt.setString(4, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByNameAndSurnameAndGroupNumberAndFaculty(String name, String surname, String groupNumber, String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ? and surname = ? and groupNumber = ? and faculty = ?");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setString(3, groupNumber);
            stmt.setString(4, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByNameAndAgeAndGroupNumberAndFaculty(String name, int age, String groupNumber, String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ? and age = ? and groupNumber = ? and faculty = ?");
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, groupNumber);
            stmt.setString(4, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsBySurnameAndAgeAndGroupNumberAndFaculty(String surname, int age, String groupNumber, String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where surname = ? and age = ? and groupNumber = ? and faculty = ?");
            stmt.setString(1, surname);
            stmt.setInt(2, age);
            stmt.setString(3, groupNumber);
            stmt.setString(4, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public List<Student> getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty(String name, String surname, int age, String groupNumber, String faculty) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("select * from students where name = ? and surname = ? and age = ? and groupNumber = ? and faculty = ?");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setInt(3, age);
            stmt.setString(4, groupNumber);
            stmt.setString(5, faculty);
            students = getSelectedStudents(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSqlDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    private List<Student> getSelectedStudents(PreparedStatement stmt) throws SQLException {
        List<Student> students = new ArrayList<>();
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Long id = rs.getLong("id");
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            int age = rs.getInt("age");
            String groupNumber = rs.getString("groupNumber");
            String faculty = rs.getString("faculty");
            Student student = new Student(id, name, surname, age, groupNumber, faculty);
            students.add(student);
        }
        return students;
    }
}
