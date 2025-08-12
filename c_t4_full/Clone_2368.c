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
    while(scanf("%c", &ch) == 1){
        if(ch == 'q' || ch == 'Q'){
            continue;
        }
        printf ("%c", ch);        
    }
    return 0;
}


