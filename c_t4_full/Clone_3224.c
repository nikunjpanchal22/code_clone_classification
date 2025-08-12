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
            while ((c = getc(stdin)) != '\n')
                ;
        }

        int main(void) {
            struct termios tio;
            printf("Enter something: ");
            tcgetattr(STDIN_FILENO, &tio);
            tio.c_lflag &= ~ECHO;
            tcsetattr(STDIN_FILENO, TCSANOW, &tio);
            munch_line();
            printf("\n");
            return 0;
}


