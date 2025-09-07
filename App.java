import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student DB ---");
            System.out.println("1) Add student");
            System.out.println("2) List students");
            System.out.println("3) Delete student");
            System.out.println("4) Update student");
            System.out.println("5) Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Name: "); 
                    String name = sc.nextLine();
                    System.out.print("Age: "); 
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Email: "); 
                    String email = sc.nextLine();
                    System.out.print("index: "); 
                    String index_no = sc.nextLine();
                    dao.addStudent(new Student(name, age, email, index_no));
                    System.out.println("Added!");
                    break;

                case "2":
                    List<Student> all = dao.getAllStudents();
                    if (all.isEmpty()) System.out.println("No students.");
                    else all.forEach(System.out::println);
                    break;

                case "3":
                    System.out.print("Enter index_no to delete: ");
                    String deleteIndex = sc.nextLine();
                    boolean deleted = dao.deleteStudent(deleteIndex);
                    if (deleted) System.out.println("Student deleted!");
                    else System.out.println("Student not found.");
                    break;

                case "4":
                    System.out.print("Enter index_no to update: ");
                    String updateIndex = sc.nextLine();
                    System.out.print("New Name: "); 
                    String newName = sc.nextLine();
                    System.out.print("New Age: "); 
                    int newAge = Integer.parseInt(sc.nextLine());
                    System.out.print("New Email: "); 
                    String newEmail = sc.nextLine();

                    boolean updated = dao.updateStudent(updateIndex, newName, newAge, newEmail);
                    if (updated) System.out.println("Student updated!");
                    else System.out.println("Student not found.");
                    break;

                case "5":
                    System.out.println("Bye");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
