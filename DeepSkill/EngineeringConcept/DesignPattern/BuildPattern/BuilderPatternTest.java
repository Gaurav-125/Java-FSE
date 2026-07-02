package BuildPattern;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                            .setCPU("Intel core I9")
                            .setSTORAGE("64 GB")
                            .setRAM("16 GB")
                            .setGraphicsCard("Nvidia RTX 3000")
                            .build();
        gamingPC.configuration( ); 

        Computer officePC = new Computer.Builder()
                            .setCPU("Intel core I7")
                            .setRAM("8 GB")
                            .setSTORAGE("32 GB")
                            .setOS("Windows 11")
                            .build();
        officePC.configuration();
    }
}
