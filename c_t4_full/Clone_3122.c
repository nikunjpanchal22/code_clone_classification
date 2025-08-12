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





#include<stdio.h>
int main(){
    int ch;
    while((ch = getchar()) != EOF){
        putchar(ch);
    }
    return 0;
}


