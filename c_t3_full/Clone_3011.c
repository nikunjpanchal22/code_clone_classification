int main () {
    int m;
    clrscr ();
    do {
        if (kbhit ()) {
            if ((m = getch ()) == 97) {
                printf ("Key a is pressed....\n");
            }
        }
    }
    while (1);
    getch ();
    return 0;
}





#include <conio.h>
int main () {
    int m;
    system("CLS");
    while (true) {
        if (_kbhit ()) {
            if ((m = _getch ()) == 'a') {
                cout << "Key a is pressed...." << "\n";
            }
        }
    }
    _getch ();
    return 0;
}


