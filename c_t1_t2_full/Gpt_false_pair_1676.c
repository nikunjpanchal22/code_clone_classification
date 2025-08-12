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


 int main(void) {
    int choice;
    char name [100];
    printf ("Type your name: ");
    scanf ("%99s", name);
    clear_stream ();
    printf ("Do you want to play a game now, %s (y/n)? ", name);
    choice = get_single_char ();
    if (choice == 'y') {
        printf ("Hit ENTER to continue:");
        get_single_char ();
    }
    else {
        puts ("That was uninspiring!");
    }
    puts ("bye");
    return 0;
}
