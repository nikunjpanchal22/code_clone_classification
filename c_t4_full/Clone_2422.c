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

    for (;;) {
        printf("Enter an integer\n");
        if (scanf("%d", &a) == 1)
            break;
        getchar();
    }

    return 0;
}


