package ProxyPattern;

public class RealImage implements Image{
    private String filename;

    RealImage(String filename){
        this.filename=filename;
        loadfromServer();
    }

    private void loadfromServer(){
        System.out.println("Loading " + filename + " from Server");
    }
    
    @Override
    public void display(){
        System.out.println("Display " + filename);
    }
}
