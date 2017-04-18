package duotaiUse;

/**
 * Created by kang on 17/4/17.
 */
public class Shapes {

    private static RandomShapeGenerator shapeGenerator = new RandomShapeGenerator();
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        for (int i=0;i<shapes.length;i++){
            shapes[i]=shapeGenerator.next();
        }

        for (Shape shape:shapes){
            shape.draw();
            shape.erase();
        }
    }


}
