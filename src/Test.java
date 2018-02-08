public class Test {
    public String name;
    protected float hp;
    public static void main(String args[]){
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3;
        Test t4;
        t3 = t1;
        t4 = t3;
        System.out.print("t4 = t2?:"+(t4==t2));
    }
}
