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


#10

int main() {
    char c;

    printf("Press key");
    while (!kbhit()) {
          printf (".");
          fflush (stdout);
          sleep (1);
    }

    c = getc(stdin);
    printf("\nCharacter received: %c\nDone.\n", c);

    return 0;
}


