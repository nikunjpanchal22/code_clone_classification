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
         m = _getwch();
         if(m == 97) { 
            printf("Key a is pressed....\n"); 
         }
      }
   } while (1); 
   _getch(); 
   return 0; 
}
