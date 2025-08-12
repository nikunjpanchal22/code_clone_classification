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

void change_terminal_settings(int file_no, struct termios *termios, int echo_flag, int setting_type) {
    tcgetattr(file_no, termios);
    termios->c_lflag &= ~echo_flag;
    tcsetattr(file_no, setting_type, termios);
    }

int main (int argc, char *argv[]) {
    struct termios termios;
    change_terminal_settings(STDIN_FILENO, &termios, ECHO, TCSAFLUSH);
    char line [MAX_LINE_SIZE] = {0};
    fgets (line, sizeof (line), stdin);
    change_terminal_settings(STDIN_FILENO, &termios, ECHO, TCSAFLUSH);
    printf ("line: %s", line);
    return 0;
}


