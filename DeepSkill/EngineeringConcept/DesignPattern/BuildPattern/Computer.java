package BuildPattern;

public class Computer {
    private String cpu;
    private String RAM;
    private String storage;
    private String GraphicsCard;
    private String OperatingSystem;

    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.RAM=builder.RAM;
        this.GraphicsCard=builder.GraphicsCard;
        this.storage=builder.storage;
        this.OperatingSystem=builder.OperatingSystem;
    }

    public void configuration(){
        System.out.println("Computer Configuration");
        System.out.println("CPU: "+cpu);
        System.out.println("RAM: "+RAM);
        System.out.println("Storage: "+storage);
        System.out.println("GraphicsCard: "+GraphicsCard);
        System.out.println("OperatingSystem: "+OperatingSystem);
    }

    public static class Builder{
        private String cpu;
        private String RAM;
        private String storage;
        private String GraphicsCard;
        private String OperatingSystem;

        public Builder setCPU(String cpu){
            this.cpu=cpu;
            return this;
        }

        public Builder setRAM(String RAM){
            this.RAM=RAM;
            return this;
        }

        public Builder setSTORAGE(String storage){
            this.storage=storage;
            return this;
        }

        public Builder setGraphicsCard(String GraphicsCard){
            this.GraphicsCard=GraphicsCard;
            return this;
        }

        public Builder setOS(String OperatingSystem){
            this.OperatingSystem=OperatingSystem;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
