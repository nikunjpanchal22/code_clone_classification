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
  int c;
  puts ("Press any key");
  for (; !kbhit (); putchar ('.'), fflush (stdout), sleep (1));
  c = getch ();
  printf ("\nCharacter received: %c\nFinished.\n", c);
  return EXIT_SUCCESS;
}


