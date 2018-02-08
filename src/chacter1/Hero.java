package chacter1;

public class Hero {
    public String name = "some hero";
    public static int i = 0;
/*    private Hero(){
        i++;
        name = "one hero";
        System.out.print("this is hero"+i);
    }
    private static Hero instance = new Hero();
    public static Hero getInstance(){
        return instance;
    }*/
    public Hero(){
        i++;
        name = "one hero";
        System.out.print("this is hero"+i);
    }
    public static void main(String args[]){

    }
}