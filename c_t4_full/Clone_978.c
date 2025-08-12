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






#define loop(c) do { printf("Hello\n"); if(kbhit()) c=getch(); } while(c != 'n')

int main (void) {
    int c = 0;
    loop(c);
    return 0;
}


