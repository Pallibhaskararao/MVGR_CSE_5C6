class animal
{
    int a = 10;
    void print()
    {
        //a = 20;
        System.out.println(this.a);                 //to refer current class instance variable
    }
    void display()
    {
        this.print();                               //to invoke current class method
    }
    animal(animal obj)                              //this keyword is useful in passing an object in constructer
    {
        this.a = obj.a;
    }
    animal(int a)                         //this keyword is useful in assign paramaterized constructer when same name occur
    {
        this.a = a;                                 //to invoke current class constructor call()
    }
    animal()
    {
        this(2);                            //return current class instance 
    }
}
class This 
{
    public static void main(String args[])
    {
        int a = 1;
        animal c1 = new animal(a);
        animal c2 = new animal();
        animal c3 = new animal(c1);
        c1.print();
        c1.display();
        System.out.println(c1.a);
        c2.print();
        c2.display();
        c3.print();
        c3.display();
    }
}