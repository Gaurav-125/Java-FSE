package DependencyInjection;

public class Main {
    public static void main(String[] args) {
        CustomerRepository repository=new CustomeRepositoryImpl();
        CustomeService service=new CustomeService(repository);

        service.getCustomerDetail(1);
    }
}
