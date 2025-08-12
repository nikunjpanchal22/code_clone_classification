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
    char d;
    printf ("Press key");
    while (!kbhit ()) {
        printf ("*");
        fflush (stdout);
        sleep (2);
    }
    d = getchar ();
    printf ("\nChar received:%c\n", d);
    printf ("Finished.\n");
    return 0;
}
