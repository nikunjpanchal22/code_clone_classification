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
    char e;
    printf ("Press key");
    while (!kbhit ()) {
        printf ("-");
        fflush (stdout);
        sleep (3);
    }
    e = getchar ();
    printf ("\nChar received:%c\n", e);
    printf ("Over.\n");
    return 0;
}
