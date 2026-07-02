package MVCpattern;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Gaurav", 1, "E");

        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(student, view);

        System.out.println("Initial Detail: ");
        controller.updateView();

        controller.setStudentName("Aman");
        controller.setStudentId(4);
        controller.setStudentGrade("A");

        System.out.println("\nUpdated view");
        controller.updateView();
    }
}
