package extendsAndConstruct;

/**
 * Created by kang on 17/4/17.
 */
public class Beetle extends Insect {

    private int k=printInit("Beetle对象开始初始化！");

    public Beetle(){
        System.out.println("k=   "+k);
        System.out.println("j=   "+j);
    }
    private static int x2=printInit("Beetle开始类加载");

    public static void main(String[] args) {
        System.out.println("main方法开始执行");

        Beetle beetle = new Beetle();
    }
}
