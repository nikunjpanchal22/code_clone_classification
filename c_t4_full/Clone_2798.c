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

struct termios uAttr, oAttr;

void setTerminal() {
        tcgetattr(fileno(stdin), &oAttr);
        uAttr = oAttr;
        uAttr.c_lflag &= ~(ICANON | ECHO);
        tcsetattr(fileno(stdin), TCSANOW, &uAttr);
        }

        void resetTerminal() { tcsetattr(fileno(stdin), TCSANOW, &oAttr); }

        int main() {
        int n = 5;
        char c = '\0';
        setTerminal();

        while (c != 'q' && n > 0) {
            c = getchar();

            if(c != EOF) {
            n++;
            printf("n++ => %d\n", n);
            } else {
            n--;
            printf("n-- => %d\n", n);
            clearerr(stdin);
            }
        }

        resetTerminal();
        return 0;
}


