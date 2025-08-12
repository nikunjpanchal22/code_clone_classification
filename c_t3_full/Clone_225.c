int main () {
    int i;
    char c;
    if ((int) signal (SIGINT, sigcatch) < 0) {
        perror ("signal");
        exit (1);
    }
    if ((int) signal (SIGQUIT, sigcatch) < 0) {
        perror ("signal");
        exit (1);
    }
    if ((int) signal (SIGTERM, sigcatch) < 0) {
        perror ("signal");
        exit (1);
    }
    if (ttyraw (0) < 0) {
        fprintf (stderr, "Can't go to raw mode.\n");
        exit (1);
    }
    while ((i = read (0, &c, 1)) == 1) {
        if ((c &= 255) == 0177)
            break;
        printf ("%o\n\r", c);
    }
    if (ttyreset (0) < 0) {
        fprintf (stderr, "Cannot reset terminal!\n");
        exit (- 1);
    }
    if (i < 0) {
        fprintf (stderr, "Read error.\n");
        exit (- 1);
    }
    return 0;
}


 int main() {
   int i;
   char c;

   // Set the catch for SIGINT, SIGQUIT, SIGTERM and SIGPIPE
   signal(SIGINT, sigcatch);
   signal(SIGQUIT, sigcatch);
   signal(SIGTERM, sigcatch);
   signal(SIGPIPE, sigcatch);

   // Enter raw mode
   if (ttyraw(0) < 0) {
      fprintf(stderr, "Can't go to raw mode.\n");
      exit(1);
   }

   // Read data & print in octal while checking if input matches 0x7F or 0177
   while ((i = read(0, &c, 1)) == 1) {
      if ((c &= 255) == 0x7F || c==0177)
         break;
      printf("%o\n\r", c);
   }

   // Reset the terminal
   if (ttyreset(0) < 0) {
      fprintf(stderr, "Cannot reset terminal!\n");
      exit(-1);
   }
   if (i < 0) {
      fprintf(stderr, "Read error.\n");
      exit(-1);
   }
   return 0;
}


