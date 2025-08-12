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


 int main(int argc, char* argv[]) { 
    struct termios termios; 
    tcgetattr(STDIN_FILENO, &termios); 
    termios.c_lflag &= ~ECHO; 
    tcsetattr(STDIN_FILENO, TCSANOW, &termios); 
    char line[MAX_LINE_SIZE] = {0}; 
    fgets(line, MAX_LINE_SIZE, stdin); 
    termios.c_lflag |= ECHO; 
    tcsetattr(STDIN_FILENO, TCSADRAIN, &termios); 
    printf("line: %s\n", line); 
    return 0; 
} 
