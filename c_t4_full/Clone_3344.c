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





int main() {
    char c;
    int i = 1;
    while ((c = getchar()) != '\n') 
        if (isdigit(c))
            i *= c - '0';
    printf("%i \n", i);
    return 0;
}


