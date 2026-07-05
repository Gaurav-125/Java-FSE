public class Main {
    public static void main(String[] args) {
        EmployeeManagement employees = new EmployeeManagement(4);

        employees.add(new Employee(1,"Rahul","SDE",180000));
        employees.add(new Employee(2,"Rajesh","Data Analyst",90000));
        employees.add(new Employee(3,"Anshu","Data engineer",120000));
        employees.add(new Employee(4,"Shreya","Data Analyst",50000));
        employees.add(new Employee(5,"Rinku","SDE",200000));

        Employee employee = employees.searchEmployee(3);
        System.out.println(employee);

        employees.Traverse();

        employees.Delete(4);

        employees.Traverse();
    }
}
