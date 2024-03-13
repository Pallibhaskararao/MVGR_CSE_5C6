class Animal
{
    int a=10,b=20;
    void print()
    {
        System.out.println("Animals are good.");
    }
}
class dog extends Animal
{
    void display()
    {
        System.out.println("Dog is also an  animal.");
    }
}
class Single
{
    public static void main(String args[])
    {
    dog obj = new dog();
    obj.display();
    obj.print();
    System.out.println(obj.a + " "+ obj.b);
    }
    
}