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
int main () {
    float a = 1e37f;
    float b = exp(a);
    float c = 3242325445.0f;
    cout << "Hello, folks!" << "\n";
    (c > b) ? cout << "Warning! " << c << " is too big!\n" : cout << "Proceed.\n";
    return 0;
}


