int main (void) {
    int choice;
    char name [100];
    printf ("Enter name: ");
    scanf ("%99s", name);
    clear_stream ();
    printf ("Play a game, %s (y/n)? ", name);
    choice = get_single_char ();
    if (choice == 'y') {
        printf ("Press ENTER to continue:");
        get_single_char ();
    }
    else {
        puts ("That was uninspiring!");
    }
    puts ("bye");
    return 0;
}




#include <stdlib.h>
int main (void) {
    char choice;
    char name [100];
    printf ("Enter name: ");
    scanf ("%99s", name);
    printf ("Play a game, %s (y/n)? ", name);
    scanf (" %c", &choice);
    if (choice == 'y') {
        printf ("Press ENTER to continue:");
        while((getchar()) != '\n'); 
    }
    else {
        puts ("That was uninspiring!");
    }
    puts ("bye");
    return 0;
}


