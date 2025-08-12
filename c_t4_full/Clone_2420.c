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
        printf("Provide an integer\n");
        if (scanf("%d", &a) > 0)
            break;
        while (getchar() != '\n');
    }
    
    return 0;
}


