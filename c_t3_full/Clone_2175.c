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
    char data [5] [100];
    for (size_t i = 0; i < sizeof(data)/sizeof(data[0]); i++) {
        fgets (data [i], sizeof(data[i]), stdin);
    }
    for (size_t i = 0; i < sizeof(data)/sizeof(data[0]); i++) {
        printf ("%s\n", data [i]);
    }
    return 0;
}


