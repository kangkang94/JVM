package practice;

/**
 * Created by kang on 17/4/17.
 */
public class SpaceShipDelegation {

    String name;
    public SpaceShipDelegation(String name){
        this.name=name;
    }
    SpaceShipControl spaceShipControl = new SpaceShipControl();

    public void up(int velocity){
        spaceShipControl.up(velocity);
    }
    public void down(int velocity){
        spaceShipControl.down(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation spaceShipDelegation = new SpaceShipDelegation("h");
        spaceShipDelegation.down(100);
        spaceShipDelegation.up(100);

    }

}
