#include <iostream>
using namespace std;
class MyClass {
public:
    int x;
    MyClass(int val) {
        x = val;
    }
    MyClass()
    {
        x = 1000;
    }
    MyClass(MyClass&s)
    {
        x = s.x;
    }
};
int main() {
    MyClass obj(10);
    MyClass obj1;
    MyClass obj3 = obj;
    cout << "Value of x: " << obj.x << endl<< "Value of x: " << obj1.x<<endl << "Value of x: " << obj3.x<< endl;
    return 0;
}
