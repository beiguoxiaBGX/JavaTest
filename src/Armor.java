public class Armor extends Item{
    private int level;
    public static void main(String args[]){
        Armor a1 = new Armor();
        a1.name = "布甲";
        a1.price = 300;
        a1.level = 15;
        System.out.println("名称 "+"价格"+" 护甲等级");
        System.out.println(a1.name+" "+a1.price+" "+a1.level);
    }
}
class Item{
    protected String name;
    protected int price;
}
