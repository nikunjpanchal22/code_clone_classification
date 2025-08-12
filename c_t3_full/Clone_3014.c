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





#include<conio.h>
#define STR "Key a is pressed....\n"
int main (void) {
    int m;
    clrscr();
    for (;;) {
        if (kbhit()) {
            if ((m=getch())=='a') {
                puts(STR);
            }
        }
    }
    getch();
    return 0;
}


