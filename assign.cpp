#include<iostream>
using namespace std;
class myclass
{
    int real,img;
    public:
    myclass(int a,int b)
    {
        real = a;
        img = b;
    }
    void operator=(const myclass & c)
    {
        real = c.real;
        img = c.img;
    }
    void print()
    {
        cout << real << "+i" << img <<endl;
    }
};
int main()
{
    myclass obj1(20,30);
    myclass obj2(25,35);
    obj1.print();
    obj2.print();
    obj1 = obj2;
    obj1.print();
    obj2.print();
    return 0;
}