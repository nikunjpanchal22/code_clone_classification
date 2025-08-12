main () {
    int c;
    while ((c = getchar ()) != EOF) {
        if (c == ' ') {
            putchar (c);
            while ((c = getchar ()) == ' ')
                ;
        }
        if (c != ' ')
            putchar (c);
    }
}





#include <cstdio>
main(){
   int ch;
   while ( EOF != ( ch=getchar()) ) {
	      if ( ch == ' ') {
		 putc( ch  , stdout );
		 while ((ch=getchar()) == ' ');
	      }
	      if ( ch != ' ') {
		  putchar(ch);
	      }
	   }
}


