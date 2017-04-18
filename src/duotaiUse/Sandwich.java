package duotaiUse;

/**
 * Created by kang on 17/4/18.
 */
public class Sandwich extends SubLunch {
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    public  Sandwich(){
        System.out.println("Sandwich!");
    }

    public static void main(String[] args) {
        
        new Sandwich();
    }
}
