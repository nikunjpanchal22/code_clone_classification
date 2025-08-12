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
            while (getc(stdin) != '\n');
        }

        int main() {
            struct termios tio;
            fputs("Enter something: ", stderr);
            tcgetattr(STDIN_FILENO, &tio);
            tio.c_lflag &= ~ECHO;
            tcsetattr(STDIN_FILENO, TCSANOW, &tio);
            munch_line();
            fputc('\n', stderr);
}


