#include<iostream>
using namespace std;
class sample
{
    int h;
    public:
    sample(int a)
    {
        h = a;
    }
    void display();
};
inline void sample::display()
{
    cout << h << endl;
}
int main()
{
    int a;
    cout << "Enter eny number : ";
    cin >> a;
    sample k(a);
    k.display();
    k.display();
    return 0;

}