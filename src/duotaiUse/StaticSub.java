package duotaiUse;

/**
 * Created by kang on 17/4/18.
 */
public class StaticSub extends StaticSuper {

    public static void staticGet(){
        System.out.println("sub staticGet()");
    }

    public  void dynamicGet(){
        System.out.println("sub dynamicGet()");
    }

    public static void main(String[] args) {
        StaticSuper staticSuper = new StaticSub();
        StaticSub staticSub = new StaticSub();

        staticSuper.staticGet();
        staticSuper.dynamicGet();

        staticSub.staticGet();
        staticSub.dynamicGet();
    }

}
