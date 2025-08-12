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
    while(c != 'n') {
        printf("Hello\n");
        c = (kbhit() ? getch() : c);
    }
    return 0;
}


