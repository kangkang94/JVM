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

    public static void main(String[] args) {
        Parcel8 parcel8=new Parcel8();
        Wrapping wrapping =parcel8.wrapping(1);
        wrapping.value();
    }
}
