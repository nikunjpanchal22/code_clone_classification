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
    while(1) {
        c = getchar ();
        if (c == 'q'){
            printf ("Exiting ...\n");
        	break;
        }
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
    tcsetattr (fileno (stdin), TCSANOW, & orig_attr);
    return 0;
}
