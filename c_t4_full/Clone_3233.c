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
            char c;
            do {
                c = getchar();
            } while (c != '\n');
        }

        int main() {
            struct termios tio;
            fprintf(stderr, "Enter something: ");
            tcgetattr(STDIN_FILENO, &tio);
            tio.c_lflag &= ~ECHO;
            tcsetattr(STDIN_FILENO, TCSANOW, &tio);
            munch_line();
            putc('\n', stderr);
}


