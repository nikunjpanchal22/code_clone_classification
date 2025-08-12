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


  int main () 
{ 
    int fd; 
    struct termios tio; 
    printf ("Please enter something: "); 
    tcgetattr (fileno (stdin), & tio); 
    tio.c_lflag &= ~ECHO; 
    tcsetattr (fileno (stdin), TCSANOW, & tio); 
    munch_line (); 
    printf ("\n"); 
} 
