package Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by kang on 17/9/28.
 */


//动态代理类MyInvocationHandler是InvocationHandler的子类，必须实现invoke方法
public class DynamicProxy implements InvocationHandler {

    //要代理的真实对象
    private Object object;

    //给要代理的真实对象赋值
    public DynamicProxy(Object object){
        this.object = object;
    }

    /**
     *
     * @param proxy  指创造的代理对象
     * @param method  指我们要代理的真实对象的某个方法的Method对象
     * @param args    指真实对象的某个方法的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //在代理真实对象前添加我们添加一些自己的操作
        System.out.println("before rent house");

        System.out.println("Method:" + method);

        //当代理对象调用真实对象的方法时，会自动跳转到动态代理类即InvocationHandler的子类的invoke方法来调用
        method.invoke(object,args);

        //代理真实对象后添加一些操作
        System.out.println("after rent house");

        return null;
    }
}
