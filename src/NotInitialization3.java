/**
 * Created by kang on 17/4/11.
 */
public class NotInitialization3 {

    static {
        System.out.println("he");
    }

    public static void main(String[] args) {
        System.out.println(ConstClass.Hello);
    }
}
