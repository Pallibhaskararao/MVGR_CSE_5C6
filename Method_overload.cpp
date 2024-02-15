#include <iostream>
using namespace std;

class Overload
{
public:
    void display(int x) {
        cout <<x << endl;
    }

    void display(double y) {
        cout << y << endl;
    }

    void display(char z) {
        cout << z << endl;
    }
};

int main() {
    Overload obj;
    obj.display(5);
    obj.display(3.14);
    obj.display('A');
    return 0;
}
