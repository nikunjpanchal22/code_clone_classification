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





#include <ctype.h>

int main() {
    int ch;
    while ((ch = getchar()) != EOF)
    {
        putchar(ch);
        if (isspace(ch))
        {
            do {
                ch = getchar();
            } while (ch == ' ');
            putchar(ch);
        }
    }
}


