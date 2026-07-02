package MVCpattern;

public class StudentView {
    public void displayStudentDetails(String name,int id,String grade){
        System.out.println("Student Detail");
        System.out.println("---------------");
        System.out.println("Name: "+name);
        System.out.println("Student Id: "+id);
        System.out.println("Grade: "+grade);
    }
}
