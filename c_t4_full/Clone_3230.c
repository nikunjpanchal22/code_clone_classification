int main () {
    int fd;
    struct termios tio;
    printf ("Enter something: ");
    tcgetattr (fileno (stdin), & tio);
    tio.c_lflag &= ~ECHO;
    tcsetattr (fileno (stdin), TCSANOW, & tio);
    munch_line ();
    putchar ('\n');
}





#include <termios.h>
#include <stdio.h>
#include <unistd.h>

#define STDIN 0

void munch_line() {
            for(char c; (c = getchar()) != '\n';);
        }

        int main() {
            struct termios tio;
            puts("Enter something: ");
            tcgetattr(STDIN, &tio);
            tio.c_lflag &= ~ECHO;
            tcsetattr(STDIN, TCSANOW, &tio);
            munch_line();
            putchar('\n');
}


