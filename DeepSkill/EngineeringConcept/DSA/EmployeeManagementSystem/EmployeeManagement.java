public class EmployeeManagement {
    private Employee[] employees;
    private int count;

    public EmployeeManagement(int size){
        employees=new Employee[size];
        count=0;        
    }

    // add Employees
    public void add(Employee employee){
        if(count<employees.length){
            employees[count]=employee;
            count++;
        }else{
            System.out.println("Array is full!, No more Employee can be added");
        }
    }

    // search employee
    public Employee searchEmployee(int empId){
        for(Employee employee:employees){
            if(employee.getEmpId()==empId){
                return employee;
            }
        }
        return null;
    }

    // Traverse Employee array
    public void Traverse(){
        for(Employee employee:employees){
            System.out.println(employee);
        }
    }

    // Remove Employee
    public void Delete(int empId){
        int index=-1;
        for(int i=0;i<count;i++){
            if(employees[i].getEmpId()==empId){
                index=i;
                break;
            }
        }

        if(index==-1){
            System.out.println("Employee Not found");
        }

        for(int i=index;i<count-1;i++){
            employees[i]=employees[i+1];
        }

        employees[count-1]=null;
        count--;
        System.out.println("Employee deleted");
    }
}
