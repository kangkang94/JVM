import java.util.ArrayList;
import java.util.List;

/**
 * Created by kang on 17/4/6.
 */
public class HeapOOM {

    static class OOMobject{

    }

    public static void main(String[] args) {
        List<OOMobject> list = new ArrayList<>();

        while (true){
            list.add(new OOMobject());
        }


    }


}
