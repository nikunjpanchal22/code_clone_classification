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

int main(){
    for(char ch; (ch = getchar()) != EOF;){
        if(ch == 'Q'|| ch == 'q') continue;
        putchar(ch);
    }
    return 0;
}


