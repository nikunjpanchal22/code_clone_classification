int main () {
    int a;
    int b;
    char c;
    do {
        printf ("Would you like to play?\nPress 'Y' for 'Yes' or 'N' for 'No'\n");
        scanf ("%c", & c);
        if (c != 'Y' && c != 'y')
            break;
        printf ("Enter the two values you like to compare\n");
        scanf (" %d %d", & a, & b);
        if (!(a ^ b)) {
            printf ("both are equal\n");
            getchar ();
        }
        else {
            printf ("both are not equal\n");
            getchar ();
        }
    }
    while (1);
    printf ("Thanks for playing.");
    getchar ();
    return 0;
}


int main () {
    int vala;
    int valb;
    char input;
    while (1) {
        printf ("Do you want to play?\nEnter 'Y' if yes, or 'N' if no\n");
        scanf ("%c", & input);
        if (input != 'Y' && input != 'y')
            break;
        printf ("Enter two values to compare\n");
        scanf (" %d %d", & vala, & valb);
        if (vala == valb)
            printf ("values are equal\n");
        else
            printf ("values are not equal\n");
        getchar ();
    } 
    printf ("Thanks for playing.");
    getchar ();
    return 0;
}
