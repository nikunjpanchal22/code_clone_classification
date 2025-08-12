int main () {
    FILE *f;
    char c;
    f = fopen ("test.txt", "rt");
    while ((c = fgetc (f)) != EOF) {
        printf ("%c", c);
    }
    fclose (f);
    return 0;
}


 int main () {
    FILE * f;
    char c;
    int cint;
    f = fopen("test.txt", "r");
    while((cint = getc(f)) != EOF) {
        c = (char)cint;
        printf("%c", c);
    }
    fclose(f);
    return 0;
}


