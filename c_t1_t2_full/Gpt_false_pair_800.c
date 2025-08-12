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
    printf ("provide two values to compare, type finish to exit.\n");
    while (strcmp (c, "finish")) {
        scanf ("%d%d%s", & a, & b, c);
        if (!(a ^ b)) {
            printf ("identical\n");
            getchar ();
        }
        else {
            printf ("dissimilar\n");
            getchar ();
        }
    }
    printf ("Thanks for participating.");
    getchar ();
    return 0;
}
