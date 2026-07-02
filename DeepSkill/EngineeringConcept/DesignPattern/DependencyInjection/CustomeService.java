package DependencyInjection;

public class CustomeService {
    private CustomerRepository customerRepository;

    CustomeService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    public void getCustomerDetail(int id){
        String customer=customerRepository.findCustomerById(id);
        System.out.println(customer);
    }
}
