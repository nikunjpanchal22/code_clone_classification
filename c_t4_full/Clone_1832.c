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
    int k, l;
    char str [5];
    printf ("Hand over two digits or type Done to stop\n");
    while (strcmp (str, "Done")) {
        scanf ("%d%d%s", & k, & l, str);
        (!(k ^ l)) ? printf ("Matched\n") : printf ("Not Matched\n");
    }
    printf ("See you next time");
    return 0;
}


