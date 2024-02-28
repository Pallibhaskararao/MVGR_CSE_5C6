#include<iostream>
using namespace std;
class demo
{
    int x,y;
    public:
    demo(int a,int b)
    {
        x = a;
        y = b;
    }
    friend class frd;
};
class frd{
    public:
    void display(demo d1)
    {
        cout << "x is = "<<d1.x<<endl;
        cout << "y is = " << d1.y << endl;
    }
};
int main()
{
    demo d1(200,300);
    frd f1;
    f1.display(d1);
}