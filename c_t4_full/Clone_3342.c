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
    int c, i = 1;
    while((c = getchar()) != '\n')
        switch(c) {
            case '0': case '1': case '2': case '3': case '4':
            case '5': case '6': case '7': case '8': case '9':
                i *= c - '0';
        }
    printf("%d\n", i);
    return 0;
}


