public class Method_overload {
        public void display(int x) {
            System.out.println(x);
        }
    
        public void display(double y) {
            System.out.println(y);
        }
    
        public void display(char z) {
            System.out.println(z);
        }
    
        public static void main(String[] args) {
            Method_overload obj = new Method_overload();
            obj.display(5);
            obj.display(3.14);
            obj.display('A');
        }
    }
