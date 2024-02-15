#include <iostream>
using namespace std;
class MyClass {
public:
int x;
    MyClass() {
        x = 10;
        cout << "Constructor called" << endl;
    }
    ~MyClass() {
        cout << "Destructor called" << endl;
    }
};

int main() {
    MyClass obj;
    cout << "Inside main function" << obj.x<< endl;
    return 0;
}
