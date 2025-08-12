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
    int pos;  
    f = fopen("test.txt", "r");  
    while (!feof(f) && (pos = ftell(f)) != -1) {  
        fseek(f, pos, SEEK_SET);  
        c = fgetc(f); // or fscanf(f, "%c", &c);  
        printf("%c", c);  
    }  
    fclose(f);  
    return 0;  
}  

 int main(){
    FILE *f;
    char c; 
    
    f = fopen("test.txt", "r");
    
    for(int i=0;i<100;i++) {
        c = fgetc(f);
        printf("%c", c);
    }
    fclose(f);
    return 0;
}


