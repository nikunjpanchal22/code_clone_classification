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
#include <fcntl.h>

void munch_line() {
            while (fgetc(stdin) != '\n');
        }

        int main() {
            int fd = open("/dev/tty", O_RDWR);
            struct termios tio;
            printf("Enter something: ");
            tcgetattr(fd, &tio);
            tio.c_lflag &= ~ECHO;
            tcsetattr(fd, TCSANOW, &tio);
            munch_line();
            fputc('\n', stdout);
            close(fd);
}


