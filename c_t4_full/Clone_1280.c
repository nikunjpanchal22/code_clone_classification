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


#3

void main() {
    int key_press;
    fprintf(stderr, "Press key");
    while (!kbhit()) {
        fputc ('.', stderr);
        fflush (stderr);
        _sleep (1000);
    }
    key_press = getche ();
    fprintf(stderr, "\nKey received: %d '%c'\n", key_press, key_press);
    fputs ("Done.\n", stderr);
}


