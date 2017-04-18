package duotaiUse;

/**
 * Created by kang on 17/4/18.
 */
public class FieldAccess {

    public static void main(String[] args) {
        Super s = new Sub();
        Sub s1 = new Sub();
        //只能调用双方都有的方法！
        System.out.println(s.field+"   "+s.getField()+"  ");
        System.out.println(s1.field+"   "+s1.getField()+"  "+s1.getSuperField());
    }


}
