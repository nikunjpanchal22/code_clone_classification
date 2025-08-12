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
    char text [5] [100];
    int counter;
    for (counter = 0; counter < 5; counter++) {
        fgets (text [counter], 100, stdin);
    }
    for (counter = 0; counter < 5; counter++) {
        printf ("%s\n", text [counter]);
    }
    return 0;
}


