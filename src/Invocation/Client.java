package Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by kang on 17/9/28.
 */
public class Client {

    public static void main(String[] args) {

        //subject是真实对象，handler是动态代理类，往动态代理类传入真实对象
        Subject realsubject = new realSubject();
        InvocationHandler handler = new DynamicProxy(realsubject);


        /**
         * 通过Proxy的newProxyInstance方法创建代理对象
         * 1.第一个参数handler.getClass().getClassLoader()表示用动态代理类的类加载器加载代理对象
         * 2.第二个参数realSubject.getClass().getInterfaces()传入真实对象的接口，所以代理对象也可以调用接口，使用真实对象的方法。
         *
         * 3.第三个对对象handler让代理对象与动态代理类联系起来，当代理对象调用真实对象的方法时可以自动跳转到执行handler的invoke方法。
         *
         */
        Subject subject = (Subject) Proxy.newProxyInstance(
                handler.getClass().getClassLoader(),realsubject.getClass().getInterfaces(),handler);

        System.out.println(subject.getClass().getName());
        subject.rent();
        subject.hello("nihao");

    }

}
