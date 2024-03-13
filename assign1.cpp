#include<iostream>
using namespace std;
class myclass
{
    int real,img;
    public:
    myclass(int a=0,int b=0)
    {
        real = a;
        img = b;
    }
    myclass operator+(const myclass & c)
    {
        myclass r;
        r.real = real + c.real;
        r.img = img + c.img;
        return r;
    }
    void print()
    {
        cout << real << "+i" << img << endl;
    }
};
int main()
{
    myclass obj1(10,15);
    myclass obj2(2,4);
    myclass obj3 = obj1 + obj2;
    obj3.print();
    return 0;

}