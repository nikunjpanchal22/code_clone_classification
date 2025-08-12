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
#include <stdlib.h>

void munch_line() {
        while (getchar() != '\n') {}
    }

    int main() {
        struct termios tio;
        write(1, "Enter something: ", 17);
        tcgetattr(fileno(stdin), &tio);
        tio.c_lflag &= ~ECHO;
        tcsetattr(fileno(stdin), TCSANOW, &tio);
        munch_line();
        putc('\n', stdout);
        exit(0);
}


