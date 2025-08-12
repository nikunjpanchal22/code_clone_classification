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
   clrscr (); 
   do { 
      if(kbhit()) { 
         m = getche();
         if(m == 97) { 
            printf("Key a is pressed....\n"); 
         }
      }
   } while (1); 
   getchar(); 
   return 0; 
}
