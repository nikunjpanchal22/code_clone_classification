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
    bool flag = false;

    do {
        printf ("Press key");
        fflush (stdout);
        sleep (1);
        printf (".");
        c = _getch ();
        if (c == '\n')
            flag = true;
        
    } while (!_kbhit () && !flag);

    printf ("\nChar received:%c\n", c);
    printf ("Done.\n");
    return 0;
}


