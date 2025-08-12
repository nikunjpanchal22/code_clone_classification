int main () {
    int a;
    int b;
    char c [5] = {'\0'};
    printf ("Enter the two values you like to compare, type stop to end.\n");
    while (strcmp (c, "stop")) {
        scanf ("%d%d%s", & a, & b, c);
        if (!(a ^ b)) {
            printf ("both are equal\n");
            getchar ();
        }
        else {
            printf ("both are not equal\n");
            getchar ();
        }
    }
    printf ("Thanks for playing.");
    getchar ();
    return 0;
}



 

#include <stdio.h>
#include <string.h>
int main () {
    int r, s;
    char word [5];
    printf ("Present two numbers or type close to stop\n");
    while (strcmp (word, "close")) {
        scanf ("%d%d%s", & r, & s, word);
        (!(r ^ s)) ? printf ("Equal\n") : printf ("Not Equal\n");
    }
    printf ("Farewell");
    return 0;
}


