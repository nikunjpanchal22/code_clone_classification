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




#include <string.h>
int main (void) {
    int choice;
    char name [100];
    printf ("Enter name: ");
    fgets(name, sizeof(name), stdin);
    name[strcspn(name, "\n")] = 0;
    if (choice == 'y' || choice == 'Y') {
        printf ("Press ENTER to continue:");
        getc(stdin);
    }
    else {
        puts ("That was uninspiring!");
    }
    puts ("bye");
    return 0;
}


