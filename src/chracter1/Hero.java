package chracter1;

public class Hero {
    String name;
    Hero(String name){
        this.name = name;
    }
    enum heroType{
        TANK,
        WIZARD,
        FARMING,
        ASSASSIN
    }
    public static void main(String args[]){
        Hero garren = new Hero("garren");
        ADHero luna = new ADHero("luna");
        garren.kill(luna);
    }
    public void kill(ADAPHero adapHero){
        System.out.println(this.name+"击杀了");
        adapHero.die();
    }
    public void kill(ApHero apHero){
        System.out.println(this.name+"击杀了");
        apHero.die();
    }
    public void kill(ADHero adHero){
        System.out.println(this.name+"击杀了");
        adHero.die();
    }
    static class ADHero extends Hero implements Mortal{
        String name;

        ADHero(String name) {
            super(name);
        }


        @Override
        public void die() {
            System.out.println(this.name+"这个物理英雄挂了");
        }
    }
    class ApHero extends Hero implements Mortal{
        String name;

        ApHero(String name) {
            super(name);
        }

        public void die(){
            System.out.println(this.name+"这个魔法英雄挂了");
        }
    }
    class ADAPHero extends Hero implements Mortal{
        String name;
        ADAPHero(String name){
            super(name);
        }
        public void die(){
            System.out.println(this.name+"这个混合英雄挂了");
        }
    }
}
