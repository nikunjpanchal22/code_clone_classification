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
    int x, y;
    char ch[5];
    printf ("Enter two compare number or type Finish to stop.\n");
    while (strcmp (ch, "Finish")) {
        scanf ("%d%d%s", & x, & y, ch);
        (!(x ^ y)) ? printf ("Same\n") : printf ("Different\n");
    }
    printf ("Thanks and goodbye");
    return 0;
}


