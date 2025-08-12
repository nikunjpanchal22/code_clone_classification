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
    clrscr();
    while (1) {
        if (kbhit() && (m = getch())=='a') {
            printf("Key a is pressed....\n");
        }
    }
    getchar();
    return 0;
}


