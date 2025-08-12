int main (int argc, char *argv []) {
    struct termios termios;
    tcgetattr (STDIN_FILENO, & termios);
    termios.c_lflag &= ~ECHO;
    tcsetattr (STDIN_FILENO, TCSAFLUSH, & termios);
    char line [MAX_LINE_SIZE] = {0};
    fgets (line, sizeof (line), stdin);
    termios.c_lflag &= ~ECHO;
    tcsetattr (STDIN_FILENO, TCSAFLUSH, & termios);
    printf ("line: %s", line);
    return 0;
}



 

#include <stdio.h>
#include <termios.h>
#include <unistd.h>

#define MAX_LINE_SIZE 1024

void echo_off(int file_no, struct termios *termios) {
    tcgetattr(file_no, termios);
    termios->c_lflag &= ~ECHO;
    tcsetattr(file_no, TCSAFLUSH, termios);
    }

    void echo_on(int file_no, struct termios *termios) {
        termios->c_lflag |= ECHO;
        tcsetattr(file_no, TCSAFLUSH, termios);
    }

    int main (int argc, char *argv[]) {
        struct termios termios;
        echo_off(STDIN_FILENO, &termios);
        char line [MAX_LINE_SIZE] = {0};
        fgets (line, sizeof (line), stdin);
        echo_on(STDIN_FILENO, &termios);
    printf ("line: %s", line);
    return 0;
}


