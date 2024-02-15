#include<iostream>
using namespace std;
int main()
{
    int a;
    char b;
    double c;
    long d;
    float e;
    bool f;

    cout << "Size of char : " << sizeof(char) << endl<< "Enter any Charcter : ";
    cin >> b;
    cout << "Size of int : " << sizeof(int) << endl<< "Enter any integer : ";
    cin >> a;
    cout << "Size of long : " << sizeof(long) << endl;
    cin >> d;
    cout <<d << endl;
    cout << "Size of float : " << sizeof(float) << endl;
    cin >> e;
    cout << e << endl;
    cout << "Size of bool : " << sizeof(bool) << endl<< "Enter any bool : ";
    cin >> f;
    cout << f << endl;
    cout << "Size of double : " << sizeof(double) << endl;
    cin >> c;
    cout << c << endl;
}