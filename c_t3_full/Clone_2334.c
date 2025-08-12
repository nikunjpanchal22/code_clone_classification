int main () {
    float a = 1E+37f;
    float b = log (a);
    float c = 3242325445.0f;
    cout << "Hello world!" << endl;
    if (c > b) {
        cout << "you should not take exp of " << c << endl;
    }
    else {
        cout << "go on" << endl;
    }
    return 0;
}




#include<iostream>
#include<cmath>
using namespace std;
int main() {
    long double a = 1E+37l;
    long double b = log(a);
    long double c = 3242325445.0l;
    cout << "Howdy!" << endl;
    if (c > b) {
        cout << "Please don't take exp of " << c << endl;
    } else {
        cout << "all good" << endl;
    }
    return 0;
}


