package davinci;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner input= new Scanner(System.in);

        System.out.printf("Enter your First Name:  ");
        String InputFName = input.next();

        System.out.printf("Enter your Last Name:  ");
        String InputLName = input.next();

        System.out.printf("Enter your Age (in Years Only) :  ");
        int InputAge = input.nextInt();

        calculator newInst = new calculator();



        String myFullName = newInst.myName(InputFName, InputLName);
        System.out.println(myFullName);

        switch (InputAge){


            case 10:

                 System.out.print("Hello " + InputFName + " " + InputLName + ", You are too young to drink");
                break;
            case 20:
                System.out.print("Hello " + InputFName + " " + InputLName + ", Bring your Parents");
                break;

            case 30:

                System.out.print("Hurray!!!... here you go...");
                break;

            default:

                System.out.print("This is the default message");
                break;

        }


        int arr[] = {1, 2, 3, 4, 5, 6};
        ArraySum obj = new ArraySum();
        int total=obj.getTotal(arr);
        System.out.printf("total sum is : %s" ,total);


    }
}
