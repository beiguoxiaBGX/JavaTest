package chracter2;

import chracter1.Item;

public class MagicPosition extends Item {
    @Override
    public void effect() {
        super.effect();
        System.out.println("this is MagicPositon's effect");
    }
}
