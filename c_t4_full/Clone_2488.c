int main () {
    clear_icanon ();
    char input_array [5000];
    int len;
    printf ("Enter key: ");
    scanf ("%s", input_array);
    len = strlen (input_array);
    printf ("Message: %s\n", input_array);
    printf ("Message Len: %d\n", len);
    return 0;
}





#include <stdlib.h>
#include <stdio.h>
#include <string.h>

void clear_icanon (){    
    struct termios new_tio, old_tio;
    tcgetattr(STDIN_FILENO, &old_tio);
    new_tio = old_tio;
    new_tio.c_lflag &=(~ICANON &~ECHO);
    tcsetattr(STDIN_FILENO, TCSANOW, &new_tio);
}


