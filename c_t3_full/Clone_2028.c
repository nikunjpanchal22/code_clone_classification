int main (void) {
    int c = 0;
    while (c != 'n') {
        do {
            printf ("Hello\n");
        }
        while (!kbhit ());
        c = getch ();
    }
    return 0;
}






int main(void) {
    int c = 0;
    while (true) {
        printf("Hello\n");
        if (kbhit()) { 
            c = getch();
        }
        if(c == 'n') {
            return 0;
        }
    }
}


