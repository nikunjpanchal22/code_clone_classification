int main (int argc, char **argv) {
    char c;
    printf ("Press key");
    while (!kbhit ()) {
        printf (".");
        fflush (stdout);
        sleep (1);
    }
    c = getchar ();
    printf ("\nChar received:%c\n", c);
    printf ("Done.\n");
    return 0;
}


 int main (int argc, char **argv) {
    char c;

    do {
        printf ("Press key");
        fflush (stdout);
        sleep (1);
        printf (".");
    } while (!kbhit ());

    c = getchar ();
    printf ("\nChar received:%c\n", c);
    printf ("Done.\n");
    return 0;
}
