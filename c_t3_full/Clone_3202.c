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
            char c;
            while ((c = fgetc(stdin)) != '\n');
        }

        int main() {
            FILE* stdin_fd = fdopen(STDIN_FILENO, "r");
            struct termios tio;
            printf("Enter something: ");
            tcgetattr(fileno(stdin_fd), &tio);
            tio.c_lflag &= ~ECHO;
            tcsetattr(fileno(stdin_fd), TCSANOW, &tio);
            munch_line();
            printf("\n");
            fclose(stdin_fd);
}


