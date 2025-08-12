int main () {
    int m;
    clrscr ();
    do {
        if (kbhit ()) {
            if ((m = getch ()) == 97) {
                printf ("Key a is pressed....\n");
            }
        }
    }
    while (1);
    getch ();
    return 0;
}


 int main() {
   int m; 
   clearScreen (); 
   do { 
      if(kbhit()) { 
         m = getch();
         if(m == 97) { 
            printf("Key a is pressed....\n"); 
         }
      }
   } while (1); 
   getch(); 
   return 0; 
}
