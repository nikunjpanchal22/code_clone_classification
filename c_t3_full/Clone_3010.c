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





#include<stdio.h>
#include<conio.h>
int main () {
    int m;
    system("CLS");
    do {
        if (_kbhit()) {
            if ((m = _getch()) == 'a') {
                printf("Key a is pressed....\n");
            }
        }
    } while (1);
    return 0;
}


