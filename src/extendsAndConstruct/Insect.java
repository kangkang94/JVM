package extendsAndConstruct;

/**
 * Created by kang on 17/4/17.
 */
public class Insect {

    private int i=9;
    protected int j;
   // float[] floats = new float[10];

    public Insect(){
        System.out.println("i=   "+i+"j=   "+j);
        System.out.println("父类构造器调用了！");
        j=37;
    }

    public static int x1=printInit("Insect开始类加载");

    public static int printInit(String s){
        System.out.println(s);
        return 47;
    }


}
