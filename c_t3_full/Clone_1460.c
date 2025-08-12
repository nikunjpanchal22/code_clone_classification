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
    system("clear"); //for LINUX
    system("cls"); //for Windows
    do {
        if (kbhit()) {
            m =getch();
            if (m == 97) {
                printf("Key a is pressed....\n");
            }
        }
    }
    while (1);
    getchar();
    return 0;
}


