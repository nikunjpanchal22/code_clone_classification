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
    while (scanf ("%c", &ch) > 0) {
        if(ch != 'Q' && ch != 'q') {
            printf ("%c", ch);
        }
    }
    return 0;
}


