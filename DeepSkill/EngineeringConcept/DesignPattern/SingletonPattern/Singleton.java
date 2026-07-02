package SingletonPattern;
public class Singleton{
    public static void main(String arg[]){
        Logger logger1 = Logger.getinstance();
        Logger logger2 = Logger.getinstance();

        logger1.log("Application Started");
        logger2.log("User Logged In");

        System.out.println("\nChecking instances:");
        System.out.println("logger1 hashcode = " + logger1.hashCode());
        System.out.println("logger2 hashcode = " + logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Multiple Logger instances exist.");
        }
    }
}