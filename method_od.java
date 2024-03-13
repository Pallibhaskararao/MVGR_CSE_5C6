class animal
{
    int a,b;
    void print()
    {
        System.out.println("Animals are good .");
    }
}
class dog extends animal{
    dog(int x,int y)
    {
        a = x;
        b =y;
    }
    void print()
    {
        System.out.println("Dogs are also animals.");
    }
}
class method_od
{
    public static void main(String args[])
    {
        dog c = new dog(10,20);
        System.out.println(c.a + " " + c.b);
        c.print();
    }
}