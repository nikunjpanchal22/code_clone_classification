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

    while(1) {
        printf("Enter an integer \n");
        if(scanf(" %d", &a)!=EOF)
            break;
        else
            scanf("%*[^\n]");
    }

    return 0;
}


