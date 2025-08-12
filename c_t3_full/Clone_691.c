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
   while ((c = getchar()) != EOF) {
      if (c != ' ') {
         while (getchar() != ' ') 
            putchar(c);
      }
      else {
         while (getchar() == ' ')
            putchar(c);
      }
   }
}


