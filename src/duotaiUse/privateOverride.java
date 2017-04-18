package duotaiUse;

/**
 * Created by kang on 17/4/18.
 */
public class privateOverride {
    //私有方法（final）无法被覆盖
    private void f(){
        System.out.println("privateOvveride!");
    }

    public static void main(String[] args) {
        privateOverride privateOverrid = new Derived();
        privateOverrid.f();
    }
}
