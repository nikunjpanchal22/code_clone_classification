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





#include<stdlib.h>
int main () {
    int m;
    system("clear");
    while (1) {
        if (kbhit ()) {
            if ((m=getch())=='a') {
                printf("Key a is pressed....\n");
            }
        }
    }
    getch();
    return 0;
}


