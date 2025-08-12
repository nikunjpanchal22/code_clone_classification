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
    FILE *f;  
    char c;  
    f = fopen("test.txt", "r");  
    while (fscanf(f, "%c", &c) != EOF) {  
        printf("%c", c);  
    }  
    fclose(f);  
    return 0;
}
