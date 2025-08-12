main () {
    int c;
    while ((c = getchar ()) != EOF) {
        putchar (c);
        if (c == ' ') {
            while ((c = getchar ()) == ' ')
                ;
            putchar (c);
        }
    }
}


 main () {
int c;
   do {
      if ((c = getchar()) != EOF) {
         if (c == ' ') {
            putchar(c);
            while ((c = getchar()) == ' ')
               ;
            putchar(c);
         }
         else {
            putchar(c);
         }
      }
   } while (c != EOF);
}


