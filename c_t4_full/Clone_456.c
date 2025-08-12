int main () {
    char c;
    while (scanf ("%c", &c) > 0) {
        switch (c) {
        case 'q' :
        case 'Q' :
            break;
        default :
            printf ("%c", c);
        }
    }
}


 int main () {
    char c;
    while (1) {
        c = getchar();
        if (c == 'q' || c == 'Q') break;
        else printf("%c", c);
    }
}


