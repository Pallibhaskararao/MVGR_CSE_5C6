public class ClassDemo {
    public static class MyClass
    {
        int x=10,y=20,z=30;
        public int display()
        {
            return (x+y+z);
        }

    }
    public static void main(String args[])
    {
        MyClass obj = new MyClass();
        System.out.println(obj.display());

    }
    
}