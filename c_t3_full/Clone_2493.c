int main () {
    char n = 'Y';
    while (n == 'Y') {
        printf ("Add Next Y/N: ");
        n = getc (stdin);
        getchar ();
    }
    printf ("n = %c", n);
}



int main() {
    int n = 'Y';
    while (n == 'Y') {
        printf ("Add Next Y/N: ");
        n = fgetc(stdin);
        fgetc(stdin);
    }
    printf ("n = %c", n);
}


