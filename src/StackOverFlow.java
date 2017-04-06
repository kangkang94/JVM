/**
 * Created by kang on 17/4/6.
 */

/**
 * 大量定义局部变量，使线程请求的虚拟机栈深度大于虚拟机所允许的最大深度
 */
public class StackOverFlow {


    int index=0;

    public void stackLeak(){
        index++;
        stackLeak();
    }

    public static void main(String[] args) {
        StackOverFlow stackOverFlow = new StackOverFlow();
        try {
            stackOverFlow.stackLeak();
        }catch (Exception e){
            System.out.println(e);
        }

    }


}
