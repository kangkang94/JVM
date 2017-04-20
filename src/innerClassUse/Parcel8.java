package innerClassUse;

/**
 * Created by kang on 17/4/18.
 */
public class Parcel8 {

    public Wrapping wrapping(int x){

        return new Wrapping(x){
            public int value(){
                System.out.println(super.value());
                return super.value();
            }
        };
    }
    //匿名内部类中使用外部类定义的对象，要加上final修饰符
    public StringDefine stringDefine( String name){
        return new StringDefine(){
          private String string = name;


        };
    }

    public static void main(String[] args) {
        Parcel8 parcel8=new Parcel8();
        Wrapping wrapping =parcel8.wrapping(1);
        wrapping.value();

        StringDefine stringDefine = parcel8.stringDefine("hello");


    }
}
