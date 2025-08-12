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
    bool finish = false;
    do {
        x = poll (&attention, 1, 100);
        if (x < 0) {
            printf ("problem %d\n", errno);
            finish = true;
        }
        else if (x) {
            printf ("you rang %x ?", x);
            y = getc (stdin);
            printf (" %c of course\n", y);
            if (y == '.')
                return 0;
        }
    } while(!finish);
    return 0;
}


