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
    while(1) {
        if(kbhit()) {
            c = getch();
            if(c == 'n') break;
        }
        printf("Hello\n");
    }
    return 0;
}


