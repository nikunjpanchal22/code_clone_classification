int main () {
    char c;
    while (scanf ("%c", &c) > 0) {
        switch (c) {
        case 'q' :
        case 'Q' :
            break;
        default :
            printf ("%c", c);
        }
    }
}





#include <stdio.h>

int main() {
    char ch;
    while((ch = getchar()) != EOF){
        if(ch != 'Q' && ch != 'q'){
            putchar(ch);
        }
    }
    return 0;
}


