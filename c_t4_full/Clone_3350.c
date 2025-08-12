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
    while ((c = getchar()) != '\n') 
        i = (c >= '0' && c <= '9') ? (c - '0') * i : i;
    printf("%i \n", i);
    return 0;
}


