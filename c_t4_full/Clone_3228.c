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

void munch_line() {
        while (getchar() != '\n')
            continue;
    }

    int main() {
        struct termios tio;
        printf("Enter something: ");
        tcgetattr(fileno(stdin), &tio);
        tio.c_lflag &= ~ECHO;
        tcsetattr(fileno(stdin), TCSANOW, &tio);
        munch_line();
        printf("\n");
        return 0;
}


