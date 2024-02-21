#include<iostream>
using namespace std;
class StaticDemo
{
    static int a;
    public:
    static int meth(int a,int b)
    {
        cout << "First is the best."<< endl;
        return a+b;
    }

};
int StaticDemo::a = 10;
int main()
{
    cout << StaticDemo::meth(1,2) << endl;
    return 0;
}