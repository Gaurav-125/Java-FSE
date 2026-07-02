package ProxyPattern;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;
    
    ProxyImage(String filename){
        this.filename=filename;
    }
    
    @Override
    public void display(){

        // Lazy Initialization
        if(realImage==null){
            realImage=new RealImage(filename);
        }

        // cached object is reused
        realImage.display();
    }
}
