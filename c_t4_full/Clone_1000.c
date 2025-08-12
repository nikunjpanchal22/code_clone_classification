int main (void) {
    int x;
    scanf ("%d", & x);
    if (x == 1)
        printf ("ON");
    else if (x == 0)
        printf ("OFF");
    else
        printf ("Unexpected Input");
}





#include<iostream>
using namespace std;

int main () {
    int y;
    cin >> y;
    if (y == 1)
        cout << "ON";
    else if (y == 0)
        cout << "OFF";
    else
        cout << "Unexpected Input";
    return 0;
}


