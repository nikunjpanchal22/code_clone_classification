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


//10 
main () {
    int c, i;
    c = getchar ();
    i = 1;
      
    for (; c != '\n'; c = getchar()) {
        if (c >= 48 && c <= 57) {
            i *= c - '0';
        }
    }
    printf ("%d", i);
}


