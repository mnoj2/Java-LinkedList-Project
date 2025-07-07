

public class StudentLinkedList {
    Node head;

    public void insert(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("No student records to display.");
            return;
        }
        Node temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll No: " + temp.data.rollNo + ", Name: " + temp.data.name);
            temp = temp.next;
        }
    }

    public void delete(int rollNo) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student with roll no " + rollNo + " deleted.");
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.data.rollNo != rollNo) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Student with roll no " + rollNo + " not found.");
            return;
        }

        prev.next = current.next;
        System.out.println("Student with roll no " + rollNo + " deleted.");
    }

    public void search(int rollNo) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.rollNo == rollNo) {
                System.out.println("Student found: Roll No: " + temp.data.rollNo + ", Name: " + temp.data.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with roll no " + rollNo + " not found.");
    }
}
