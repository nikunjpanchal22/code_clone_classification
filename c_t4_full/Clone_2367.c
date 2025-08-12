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
    while((ch=fgetc(stdin)) != EOF){
        if(ch=='q' || ch=='Q') continue;
        printf("%c", ch);
    }
    return 0;
}


