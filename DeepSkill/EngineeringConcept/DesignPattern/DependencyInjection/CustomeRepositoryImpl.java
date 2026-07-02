package DependencyInjection;

public class CustomeRepositoryImpl implements CustomerRepository{
    @Override
    public String findCustomerById(int id){
        return "Customer ID: "+id+" Name: Aditya";
    }
}
