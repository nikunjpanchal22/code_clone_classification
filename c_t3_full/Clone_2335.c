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
    double a = 1e37;
    double b = log(a);
    double c = 3242325445.0f;
    cout << "Hello planet!" << "\n";
    if (c > b) {
        cout << "Avoid exp of "<<c<<endl;
    } else {
        cout << "OK"<<endl;
    }
    return 0;
}


