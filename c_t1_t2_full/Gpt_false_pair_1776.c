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
      if(_kbhit()) { 
         if((m = _getch()) == 97) { 
            printf("Key a is pressed....\n"); 
         }
      }
   } while (1); 
   _getch(); 
   return 0; 
}
