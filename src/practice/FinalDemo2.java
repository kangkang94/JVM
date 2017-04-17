package practice;

/**
 * Created by kang on 17/4/17.
 */
public class FinalDemo2 {
    /**
     * 在参数列表中声明final，在方法中无法更改参数引用，或基本数据类型
     */
   /**
    void with(final FinalDemo finalDemo){
        finalDemo = new FinalDemo();
    }
    **/

   void without(FinalDemo finalDemo){
       finalDemo = new FinalDemo();
   }

   int g(final int i){
      return i+1;
   }


}
