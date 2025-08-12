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
    while (c != 'n') {
        printf("Hello\n");
        c = getch();
        
        while(!kbhit()) {
            // Empty loop, to wait for the next input
        }
    }
    return 0;
}
