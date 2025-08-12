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
    printf ("Provide two values to compare, type quit to end.\n");
    while (strcmp (c, "quit")) {
        scanf ("%d%d%s", & a, & b, c);
        if (!(a ^ b)) {
            printf ("the same\n");
            getchar ();
        }
        else {
            printf ("not the same\n");
            getchar ();
        }
    }
    printf ("Thank you for joining.");
    getchar ();
    return 0;
}
