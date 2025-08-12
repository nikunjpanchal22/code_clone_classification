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
#include<math.h>
using namespace std;
int main () {
    float a = pow(10.0f, 37.0f);
    float b = log(a);
    float c = 3242325445.0f;
    cout << "Hello world!" << endl;
    (c > b) ? cout << "Avoid " << c << endl : cout << "no issue" << endl;
    return 0;
}


