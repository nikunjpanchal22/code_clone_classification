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
    char ch;
    while ((ch = getchar()) != EOF) {
        printf("%c", ch);
    }
    return 0;
}


