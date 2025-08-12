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
    for (int flag = 1; flag; ) {
        x = poll (&attention, 1, 100);
        if (x < 0) {
            fprintf(stdout, "problem %d\n", errno);
            flag = 0;
        }
        else if (x) {
            printf ("you rang %x ?", x);
            y = getc_unlocked(stdin);
            printf (" %c of course\n", y);
            if (y == '.')
                flag = 0;
        }
    }
    return 0;
}


