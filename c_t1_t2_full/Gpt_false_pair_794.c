int main () {
    int a;
    int b;
    char c [5] = {'\0'};
    printf ("Enter the two values you like to compare, type stop to end.\n");
    while (strcmp (c, "stop")) {
        scanf ("%d%d%s", & a, & b, c);
        if (!(a ^ b)) {
            printf ("both are equal\n");
            getchar ();
        }
        else {
            printf ("both are not equal\n");
            getchar ();
        }
    }
    printf ("Thanks for playing.");
    getchar ();
    return 0;
}


 int main () {
    int a;
    int b;
    char c [5] = {'\0'};
    printf ("Enter two values you want to compare, type exit to leave.\n");
    while (strcmp (c, "exit")) {
        scanf ("%d%d%s", & a, & b, c);
        if (!(a ^ b)) {
            printf ("they are equal\n");
            getchar ();
        }
        else {
            printf ("they are unequal\n");
            getchar ();
        }
    }
    printf ("Thanks for playing. Have a nice day.");
    getchar ();
    return 0;
}
