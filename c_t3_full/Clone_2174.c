int main () {
    char str [5] [100];
    for (int i = 0; i < 5; i++) {
        fgets (str [i], 100, stdin);
    }
    for (int j = 0; j < 5; j++) {
        printf ("%s\n", str [j]);
    }
    return 0;
}



#include <stdio.h>
int main () {
    char input [5] [100];
    int item1, item2;
    for (item1 = 0; item1 < 5; item1++) {
        fgets (input [item1], 100, stdin);
    }
    for (item2 = 0; item2 < 5; item2++) {
        fprintf (stdout, "%s\n", input [item2]);
    }
    return 0;
}


