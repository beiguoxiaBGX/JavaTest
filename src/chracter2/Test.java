package chracter2;

public class Test {
    public String name;
    protected float hp;
    private static int i=0;
    private Test(){
        i++;
        System.out.println("this is test"+i);
    }
    private static Test instance;
    public static Test getInstance(){
        if(instance==null){
            instance = new Test();
        }
        return instance;
    }
    public static void main(String args[]){

    }
}
