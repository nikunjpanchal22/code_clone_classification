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
    do {
        printf("Hello\n");
        c = getch();
        if (c != 'n') {
            continue;
        } else {
            break;
        }
    } while (1);
     return 0;
}


