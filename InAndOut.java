import java.util.Scanner;
public class InAndOut
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string : ");
        String str = sc.nextLine();
        System.out.println("The String is : "+ str);

        System.out.print("Enter any number : ");
        int x = sc.nextInt();
        System.out.println("The number is : " + x);

    

        System.out.print("Enter any float number : ");
        float f = sc.nextFloat();
        System.out.println("The folat is :"+f);

        System.out.print("Enter any double floating number : ");
        double d = sc.nextDouble();
        System.out.println(d);

        System.out.print("Enter any long number : ");
        long l = sc.nextLong();
        System.out.println(l);
    }
}

