package practice;

/**
 * Created by kang on 17/4/17.
 */
public class Pop {

    public final static int INT =1;
    public final int classId ;

    public Pop(int i){
        classId=i;
    }

    @Override
    public String toString() {
        return "Pop  " +classId;
    }

    public static void main(String[] args) {
        Pop p1=new Pop(1);
        Pop p2 = new Pop(2);
        System.out.println(p1);
        System.out.println(p2);
       // p1.classId=3;
    }

}
