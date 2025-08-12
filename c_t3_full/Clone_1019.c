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
    char c; 
    f = fopen("test.txt", "r");
    while(!feof(f)) {
        fread(&c,sizeof(char),1,f);
        printf("%c", c);
    }
    fclose(f);
    return 0;
}


