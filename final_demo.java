// final -->to create constant variable
// final -- > prevent method overridding
// final --> prevent inheritance
final class animal                      // class is declared as final,hence no inheritance 
{
    final int a = 10;                   //variable is declared as final value cannot be modified
    animal()
    {
        a = 5;
    }
    final void print()                      //method is final hence no overridden
    {
        System.out.println("animals are good");
    }
}
class dog extends animal
{
void print()
{
}
}
class cat extends animal
{

}
class final_demo
{
    public static void main(String args[])
    {
        dog obj = new dog();
        System.out.println(obj.a);
    }
}