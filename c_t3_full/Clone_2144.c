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





#include <stdio.h>
#include <conio.h>
#include <unistd.h>

int main(int argc, char **argv) {
	  char c;

	  fputs("Press a key", stdout);
	  do {
	    fputc('.', stdout);
	    fflush(stdout);
	    sleep(1);
	  } while (!kbhit());
	  c = getchar();
	  printf("\nReceived: %c\n", c);
	  puts("Finished!\n");

	  return 0;
}


