package week_3;
class StaticDemo {
    
    static
    {
        System.out.println("first is the best.");
    }

    static int  x =5;
    static float  y =5;

    static int  meth(int a,int b)
    {
        int sum = a+b;
        return sum;
    }

    public static void main(String args[])
    {
        System.out.println(x + " " + y);
        System.out.println(meth(10,20));
    }
}