/**
 * Created by kang on 17/4/15.
 */

import java.io.IOException;
import java.io.InputStream;

/**
 * 不同的类加载器对instanceof关键字的影响
 */
public class ClassLoadTest {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        ClassLoader  loader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try { //相同的二进制字节流
                String filename = name.substring(name.lastIndexOf(".")+1)+".class";



                    InputStream   is = getClass().getResourceAsStream(filename);
                    if (is==null){
                        return super.loadClass(name);
                    }
                    byte[]  bytes = new byte[is.available()];
                    is.read(bytes);
                    return defineClass(name,bytes,0,bytes.length);


                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }

            }
        };


       Object object = loader.loadClass("/Users/kang/Documents/github/JVM/src/ClassLoadTest.java").newInstance();

      //  ClassLoadTest loadTest =new ClassLoadTest();
        System.out.println(object.getClass());
        //System.out.println(object instanceof src.ClassLoadTest);



    }

}
