package chracter1;

public class ExtendsTest {
    public static void main(String args[]){
        Father f = new Father("tom",32);
        Child c = new Child("jerry",10,40.33);
        Father f2 = (Father) c;
        System.out.println(f2.age+" "+f2.name);
        Child c2 = (Child)f;
    }
}
class Father{
    String name;
    int age;
    Father(String name,int age){
        this.age=age;
        this.name=name;
    }
}
class Child extends Father{
    String name;
    int age;
    double money;
    Child(String name,int age,double money){
        super(name,age);
        this.money = money;
    }
}
