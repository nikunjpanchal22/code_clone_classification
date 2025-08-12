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


 int main() {
    FILE *f;
    int c;
    int i = 0;
    f = fopen("test.txt", "r");

    while ((c = fgetc(f)) != EOF) {
        if (i % 2 == 0) {
            printf("%c", c);
        }
        i++;
    }
    
    fclose(f);
    return 0;
}


