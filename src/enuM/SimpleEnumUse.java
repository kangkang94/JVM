package enuM;

/**
 * Created by kang on 17/4/17.
 */
public class SimpleEnumUse {


    public static void main(String[] args) {

        Spiciness spiciness=Spiciness.KANGYUHANG;
        System.out.println(spiciness);


        for(Spiciness s: spiciness.values()){

            System.out.println(s+"  ordinal  "+s.ordinal());
        }

    }

}
