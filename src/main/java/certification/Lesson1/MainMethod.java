package certification.Lesson1;

import com.sun.media.jfxmedia.logging.Logger;

/**
 * Created by vmishra on 1/22/2019.
 */
public class MainMethod {

    /**
     *
     * @param anyVar
     */

    public static void main (String[] anyVar){ //Here it can be also like args[] String or anyVar[] String
        System.out.println("Argument count is : " + anyVar.length);

        for (int i = 0; i< anyVar.length;i++){
            System.out.println("Argument value is arg[" +  i + "] : " + anyVar[i]);
        }

        for (int i =0; i<10; ){
            i++;
            System.out.print("Hello World");
        }
        System.out.println("\n");
        for (int i =0; i<10; ){
            ++i;
            System.out.print("Hello World");
        }


        int x=2;
        System.out.println("\n");
        x*=2+3; // => x=x *(2+3)
        System.out.println(x);

         x=4;
        System.out.println((x>2? (x<4 ?10:2):3));

        final char a='A', b='D';
        System.out.println(a);
        System.out.println(b);

        String text = new String("Hello");
        System.out.println(text);

        Integer z = new Integer(5);
        System.out.println(z*z);

        System.out.println("a" + 5);

        for (int i=1; i<=10;i++){
            System.out.print(i + "\t");
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }
}
