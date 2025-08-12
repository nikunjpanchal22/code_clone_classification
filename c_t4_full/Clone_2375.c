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

void main(){
    char ch;
    while(scanf("%c", &ch) ==1 && (ch!='q' && ch!='Q')){
        printf("%c",ch);
    }
}


