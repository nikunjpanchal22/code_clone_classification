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
    printf ("Press key");
    while (!kbhit ()) {
        printf ("-");    //Symbol changed from '.' to '-'
        fflush (stdout);
        sleep (1);
    }
    c = getchar ();
    printf ("\nChar received:0x%X\n", c);   //Format changed from %c to 0x%X
    printf ("Done.\n");
    return 0;
}
