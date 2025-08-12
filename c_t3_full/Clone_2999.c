int main () {
    int x, y;
    for (;;) {
        x = poll (&attention, 1, 100);
        if (x < 0) {
            printf ("problem %d\n", errno);
            break;
        }
        else if (x) {
            printf ("you rang %x ?", x);
            y = getc (stdin);
            printf (" %c of course\n", y);
            if (y == '.')
                break;
        }
    }
    return 0;
}





int main () {
    int x, y;
    while (true) {
        x = poll (&attention, 1, 100);
        if (x < 0) {
            printf ("problem %d\n", errno);
            exit(1);
        }
        else if (x) {
            printf ("you rang %x ?", x);
            y = fgetc(stdin);
            printf (" %c of course\n", y);
            if (y == '.')
                exit(0);
        }
    }
}


