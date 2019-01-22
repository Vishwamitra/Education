package certification.Lesson1;

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
