main () {
    int c;
    while ((c = getchar ()) != EOF) {
        putchar (c);
        if (c == ' ') {
            while ((c = getchar ()) == ' ')
                ;
            putchar (c);
        }
    }
}





#include<stdio.h>
#define BLANK ' '

int main()
{
    int c;
    while((c=getchar())!=EOF)
    {
        if(c!=' ')
            putchar(c);
        else if((c=getchar())!=' ')
            putchar(c);
    }
}


