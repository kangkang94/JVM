package practice;

/**
 * Created by kang on 17/4/17.
 */
public class SpaceShip extends SpaceShipControl{
    private String name;
    public SpaceShip(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip("NASA");
        spaceShip.up(100);

    }

}
