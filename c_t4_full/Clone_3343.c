main () {
    int c, i;
    c = getchar ();
    i = 1;
    while (c != '\n') {
        if (c >= 48 && c <= 57)
            i = (c - '0') * i;
        c = getchar ();
    }
    printf ("%d", i);
}





int main () {
    int c, i = 1;
    do {
        c = getchar ();
        if (c >= 48 && c <= 57)
            i = (c - '0') * i;
    }
    while (c != '\n');
    printf ("%d", i);
    return 0;
}


