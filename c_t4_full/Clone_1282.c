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


#5

int main() {
    char key;
    putstr("Press key");
    for (; !kbhit(); fputc ('.', stdout), fflush (stdout), usleep (1000000));
    key = fgetc (stdin);
    printf ("\nCharacter received: %c\nEnd.\n", key);
    return 0;
}


