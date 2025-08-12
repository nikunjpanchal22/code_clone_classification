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


#4

int main() {
    unsigned char ch;

    fprintf(stderr, "Press key");
    while (!kbhit())
      fprintf(stderr, "."), fflush(stderr), sleep(1);

    ch = getch();
    fprintf(stderr, "\nReceived: %d-%c\nDone.\n", ch, ch);
}


