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


#7

int main() {
    char ch;
    puts("Press key");

    do {
        putc('.', stdout);
        fflush(stdout);
        sleep(1);
    } while (!kbhit());
    
    ch = getchar();
    printf("\nCharacter received: %c\nDone.\n", ch);

    return 0;
}


