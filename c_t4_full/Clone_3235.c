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

void munch_line() {
            while (getchar() != '\n');
        }

        int main() {
            struct termios tio;
            fputs("Enter something: ", stdout);
            tcgetattr(0, &tio);
            tio.c_lflag &= ~ECHO;
            tcsetattr(0, TCSANOW, &tio);
            munch_line();
            printf("\n");
}


