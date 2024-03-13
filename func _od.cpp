#include<iostream>
using namespace std;
class animal
{
    public:
    int a,b;
    void dispaly()
    {
        cout << "animls are good "<< endl; 
    }
};
class dog : public animal
{
    dog(int x,int y)
    {
        a =x;
        b = y;
    }
    public:
    void display()
    {
        cout << "Bhaskar is also a animal" << endl;
    }
};
int main()
{
    dog obj(1,2);
    cout << obj.a << " " << obj.b << endl;
    obj.display();
}