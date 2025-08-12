main () {
    int c;
    while (1) {
        c = getchar ();
        if (c == EOF) {
            break;
        }
        putchar (c);
    }
}





#include <stdio.h>
int main(void){
    for(int c = getchar(); c != EOF; c = getchar()){
        printf("%c", c);
    }
    return 0;
}


