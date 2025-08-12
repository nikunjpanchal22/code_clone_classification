int main (int argc, char *argv []) {
    struct termios orig_attr, new_attr;
    int c = '\0';
    int n = 5;
    tcgetattr (fileno (stdin), & orig_attr);
    memcpy (& new_attr, & orig_attr, sizeof (new_attr));
    new_attr.c_lflag &= ~(ICANON | ECHO);
    new_attr.c_cc[VMIN] = 0;
    new_attr.c_cc[VTIME] = 10;
    tcsetattr (fileno (stdin), TCSANOW, & new_attr);
    printf ("Starting with n = %d\n", n);
    do {
        c = getchar ();
        if (c != EOF) {
            n++;
            printf ("Key pressed!\n");
            printf ("n++ => %d\n", n);
        }
        else {
            n--;
            printf ("n-- => %d\n", n);
            if (n == 0) {
                printf ("Exiting ...\n");
                break;
            }
            if (feof (stdin)) {
                clearerr (stdin);
            }
        }
    }
    while (c != 'q');
    tcsetattr (fileno (stdin), TCSANOW, & orig_attr);
    return 0;
}





#include <stdio.h>
#include <termios.h>
#include <unistd.h>
#include <string.h>

int main() {
    struct termios old_tio, new_tio;
    char ch = '\0';
    int count = 5;
    tcgetattr(STDIN_FILENO, &old_tio);
    new_tio = old_tio;
    new_tio.c_lflag &=(~ICANON & ~ECHO);
    new_tio.c_cc[VMIN] = 1;
    new_tio.c_cc[VTIME] = 1;
    tcsetattr(STDIN_FILENO, TCSANOW, &new_tio);
    
    while(ch != 'q') {
        printf("\nWaiting for input...\n");
        ch = getchar();
        if (ch != EOF) { // if a character was read
            count++;
        } else { // if no character was read
            count--;
            if (count == 0) break;
            clearerr(stdin);
        }
    }

    tcsetattr(STDIN_FILENO,TCSANOW,&old_tio);

    return 0;
}


