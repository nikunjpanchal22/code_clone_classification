main () {
    int c;
    while (1) {
        c = getchar ();
        if (c == EOF) {
            break;
        }
        putchar (c);
    }
}





#include <stdio.h>
int main() {
    int c;
    while (scanf("%c", &c) != EOF) {
        printf("%c", c);
    }
    return 0;
}


