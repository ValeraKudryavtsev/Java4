package task5;

public class Singleton01 {
    private Singleton01 instance;
    
    public synchronized Singleton01 getInstance() {
        if(instance == null) {
            instance = new Singleton01();
            return instance;
        }
        return instance;
    }
}
