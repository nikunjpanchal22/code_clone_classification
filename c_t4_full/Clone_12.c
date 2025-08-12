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


 
int main() {
    while (1) {
        printf("Hello\n");
        if (kbhit()) {
            int c = getch();
            if (c == 'n') break;
        }
    }
    return 0;
}


