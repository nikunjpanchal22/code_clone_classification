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





int main(void) {
    int m;
    system("CLS");
    do {
        if(_kbhit()) {
            m = _getch();
            if(m == 'a') {
                puts("Key a is pressed....");
            }
        }
    } while(1);
    _getch();
    return EXIT_SUCCESS;
}


