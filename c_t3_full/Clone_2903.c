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
    struct termios old_attr, new_attr;
    int n = 5, c;

    tcgetattr(fileno(stdin), &old_attr);
    new_attr = old_attr;
    new_attr.c_lflag &= ~(ECHO | ICANON);
    tcsetattr(fileno(stdin), TCSANOW, &new_attr);

    do {
        c = getchar();
        if (c!= EOF) {
            n++;
        } else {
            n--;
            if (n == 0) {
                break;
            }
            clearerr(stdin);
        }
    } while(c != 'q');

    tcsetattr(fileno(stdin), TCSANOW, &old_attr);
    return 0;
}


