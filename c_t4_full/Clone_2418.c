int main () {
    int a;
    do {
        printf ("Give an intiger\n");
        if (scanf ("%d", &a)) {
            break;
        }
        if (scanf ("%*[^\n]") == EOF) {
            break;
        }
    }
    while (1);
}





#include <stdio.h>

int main() {
    int a;

    while (1) {
        printf("Type an integer\n");
        if (scanf("%d", &a))
            exit(0);
        if (feof(stdin))
            exit(1);
    }

    return 0;
}


