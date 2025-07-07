import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Record Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Delete Student by Roll No");
            System.out.println("4. Search Student by Roll No");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    list.insert(new Student(roll, name));
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    System.out.print("Enter roll number to delete: ");
                    int delRoll = sc.nextInt();
                    list.delete(delRoll);
                    break;

                case 4:
                    System.out.print("Enter roll number to search: ");
                    int searchRoll = sc.nextInt();
                    list.search(searchRoll);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
