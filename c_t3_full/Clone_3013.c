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



int main () {
    int m;
    system("cls");
    for (;;) {
        if (_kbhit()) {
            if ((m = _getch()) == 'a') {
                puts("Key a is pressed....");
            }
        }
    }
    _getch();
    return 0;
}


