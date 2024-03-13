#include<iostream>
using namespace std;
class animal
{
    public:
    int a = 10, b= 20;
    public:
    void print()
    {
        cout << "Animals are good."<< endl;
    }
};
class dog : public animal
{
    public:
    void display()
    {
        cout << "dog is also is onr amimal" << endl; 
    }
};
int main()
{
    dog obj;
    obj.print();
    obj.display();
    cout << obj.a << " " << obj.b << endl;
    return 0;
}