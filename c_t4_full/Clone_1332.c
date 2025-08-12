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
#define MAX_STR_LEN 100
#define STR_COUNT 5
int main () {
    char str [STR_COUNT][MAX_STR_LEN];
    for (int i = 0; i < STR_COUNT; i++) {
        fgets (str [i], MAX_STR_LEN, stdin);
    }
    for (int i = 0; i < STR_COUNT; i++) {
        printf ("%s\n", str [i]);
    }
    return 0;
}


