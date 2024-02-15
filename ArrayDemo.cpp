#include <iostream>
using namespace std;

int main() {
    int numbers[5] ;
    cout << "Enter elemrnts : ";
    for(int i = 0; i < 5; ++i) {
        cin >> numbers[i];
    }
    cout << "Elements of the array: ";
    for(int i = 0; i < 5; ++i) {
        cout << numbers[i] << "  ";
    }
    cout << endl;

    return 0;
}
