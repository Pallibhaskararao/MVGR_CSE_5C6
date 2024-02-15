import java.util.Scanner;
public class ArrayDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[5];
        System.out.print("Enter the elements : ");
        for(int i = 0; i < numbers.length; ++i) {
            numbers[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Elements of the array: ");
        for(int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
