package innerClassUse;

/**
 * Created by kang on 17/4/18.
 */
public class DotNew {

    public class Inner{
        public Inner(int i){
            System.out.println(i);
        }
    }

    //产生内部类
    public Inner getInner(){
        return new Inner(1);
    }


    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner inner = dotNew.new Inner(2);
        dotNew.getInner();
    }

}
