package Invocation;

/**
 * Created by kang on 17/9/28.
 */
//真实对象
public class realSubject implements Subject {

    @Override
    public void rent() {
        System.out.println("I want to rent my house!");
    }

    @Override
    public void hello(String hello) {
        System.out.println("hello  " +hello);
    }
}
