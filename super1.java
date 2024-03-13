
//it has 3 advantages with super keyword 
//1.using for access the parent class variables in sub class
//2.using for methodes inside super class in sub class
//3,using for constructor inside sub class constructer
class animal
{
    String name = "bhaskar";
    animal()
    {
        System.out.println("Animal is coming");
    }
    void charter()
    {
        System.out.println("Bhskar is good ");
    }
}
class dog extends animal{
    String name = super.name;// the super keyword is only possible i imediate class not in static class
    dog()
    {
        super(); //it is only possible inside a constucter another construcer is created using super().
    }
    void charter()
    {
        System.out.println("dog has also good ");
        super.charter();//super.method() is only work inside another and imesiate sub class method only
    }

}
class super1
{
    public static void main(String args[])
    {
        dog c = new dog();
        c.charter();
        System.out.println(c.name);

    }
}