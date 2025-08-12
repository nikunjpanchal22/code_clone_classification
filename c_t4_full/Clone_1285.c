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


#6

int main() {
    int c;
    write(1, "Press key", 9);
    while (!kbhit())
      write(1, ".", 1), fflush(stdout), sleep(1);

    c = getchar();
    printf("\nChar received:%c\nDone.\n", c);
}


