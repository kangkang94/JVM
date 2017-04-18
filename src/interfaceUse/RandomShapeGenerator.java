package interfaceUse;

import java.util.Random;

/**
 * Created by kang on 17/4/17.
 */
public class RandomShapeGenerator {
    private Random random = new Random(47);


    public Shape next(){

        switch (random.nextInt(4)){
            default:
            case 3:return new Circle();
            case 1:return new Square();
            case 2:return new Triangle();

        }

    }

}
