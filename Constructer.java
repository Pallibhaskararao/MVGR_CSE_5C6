 class Constructer
{
        int x;
        Constructer()
        {
            x =0;
        }
        Constructer(int val){
            x = val;
        }

        public static void main(String[] args) {
            Constructer obj = new Constructer(10);
            Constructer obj1 = new Constructer();
            System.out.println("Value of x: "+ obj.x);
            System.out.println("Value of x: "+ obj1.x);
        }
}
