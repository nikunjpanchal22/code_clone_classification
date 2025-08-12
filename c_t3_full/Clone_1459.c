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
    int stop = false;
    while (stop == false) {
        x = poll (&attention, 1, 100);
        if (x < 0) {
            printf ("problem %d\n", errno);
            stop = true;
        }
        else if (x) {
            printf ("you rang %x ?", x);
            y = getc (stdin);
            printf (" %c of course\n", y);
            if (y == '.')
                stop = true;
        }
    }
    return 0;
}


