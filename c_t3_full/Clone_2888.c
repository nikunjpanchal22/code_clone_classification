int main () {
    int c;
    char input [MAX_LEN + 1];
    int i = 0;
    while ((c = getchar ()) != '\n' && c != EOF && i < MAX_LEN)
        input[i++] = c;
    if (c == EOF || c == '\n') {
        input[i] = '\0';
        printf ("read in your input string of: %s\n", input);
    }
    else {
        printf ("don't buffer overflow me dude!\n");
        return -1;
    }
    return 0;
}




#include<stdio.h>
#define MAX_LEN 60
int main () {
    int c;
    char input [MAX_LEN+1];
    int i = 0;
    while ((c = getchar ()) != '\n' && c != EOF && i < MAX_LEN) input[i++] = c;
    if (c == EOF || c == '\n') {
        input[i] = '\0';
    }
    return 0;
}


