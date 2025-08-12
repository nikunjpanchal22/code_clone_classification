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
    bool valid_input = false;

    while(!valid_input) {
        printf("Please enter an integer\n");
        if(scanf("%d", &a) > 0) {
            valid_input = true;
        }
        else {
            while(getchar() != '\n');
        } 
    }

    return 0;
}


