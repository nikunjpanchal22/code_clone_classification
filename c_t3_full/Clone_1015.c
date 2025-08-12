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
    char line[256], c; 
    f = fopen("test.txt", "r");
    while (fgets(f, line, sizeof(line)) != NULL) { 
        for (int i=0; line[i] != '\0';i++) { 
            c = line[i]; 
            printf("%c", c); 
        } 
    } 
    fclose (f); 
    return 0; 
}


