int main (void) {
    int i;
    double num [10];
    for (i = 1; i <= 10; i++) {
        printf ("Enter a number: ");
        if (scanf ("%lf", &num[i - 1]) != 1) {
            puts ("read error");
            return 1;
        }
    }
    return 0;
}





#include <iostream>
using namespace std;
int main () {
    int i;
    double num [10];
    for (i = 1; i <= 10; i++) {
        cout << "Enter a number: ";
        if (!(cin >> num[i - 1])) {
            cout << "read error";
            return 1;
        }
    }
    return 0;
}


