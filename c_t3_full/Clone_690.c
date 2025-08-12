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
   while (c = getchar() != EOF) {
      if (c == ' ') {
         putchar(c);
         while (getchar() == ' ')
            ;
      }
      else
         putchar(c);
   }
   }

 main () {
int c;
   while ((c = getchar()) != EOF) {
      while (c == ' ' && getchar() == ' ')
         ;
      putchar(c);
   }
   }

 main () {
int c;
   while ((c = getchar()) != EOF) {
      if (c != ' ') {
         putchar(c);
      }
      else {
         while (getchar() == ' ') {
            ;
         }
         putchar(c);
      }
   }
}


