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


#2

#include <conio.h>
#include <stdio.h>

void main()
{
    int ch;

    printf("Press any key ");
    while (!kbhit())
        printf("."), fflush(stdout), Sleep(1000); 

    ch = _getch();
    printf("\nCharacter read: %d '%c'\n", ch, ch);
    return;
}


