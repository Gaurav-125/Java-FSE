public class Employee {
    private int EmpId;
    private String EmpName;
    private String EmpPostion;
    private double Salary;

    public Employee(int EmpId,String EmpName,String EmpPostion,double Salary){
        this.EmpId=EmpId;
        this.EmpName=EmpName;
        this.EmpPostion=EmpPostion;
        this.Salary=Salary;
    }

    public int getEmpId(){
        return EmpId;
    }

    public String getEmpName(){
        return EmpName;
    }

    public String getEmpPostion(){
        return EmpPostion;
    }

    public double getSalary(){
        return Salary;
    }

    @Override
    public String toString(){
        return "EmpId: "+EmpId+" EmpName: "+EmpName+" EmpPosition: "+EmpPostion+" Salary: "+Salary;
    }
}
