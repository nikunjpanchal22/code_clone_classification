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


#8

int main (int argc, char **argv) {
    int c;
    
    printf ("Press key");
    while (!kbhit ()) {
            putchar ('.');
            fflush (stdout);
            sleep (1);
    }
    c = fgetc (stdin);
    printf ("\nChar received:%c\n", c);
    printf ("Done.\n");
    return EXIT_SUCCESS;
}


