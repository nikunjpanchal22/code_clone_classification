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

void disable_echo_input()
{
    struct termios termios;
    tcgetattr (STDIN_FILENO, &termios);
    termios.c_lflag &= ~ECHO;
    tcsetattr (STDIN_FILENO, TCSAFLUSH, &termios);
    }

    void enable_echo_input()
    {
        struct termios termios;
        tcgetattr (STDIN_FILENO, &termios);
        termios.c_lflag |= ECHO;
        tcsetattr (STDIN_FILENO, TCSAFLUSH, &termios);
    }

int main (int argc, char *argv[]) 
{
    disable_echo_input();
    char line [MAX_LINE_SIZE] = {0};
    fgets (line, sizeof (line), stdin);
    enable_echo_input();
    printf ("line: %s", line);
    return 0;
}


