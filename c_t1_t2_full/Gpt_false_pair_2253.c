int main () {
    char line [1024];
    FILE *fp = fopen ("filename.txt", "r");
    if (fp == NULL) {
        return 1;
    }
    while (fgets (line, 1024, fp)) {
        printf ("%s\n", line);
    }
    return 0;
}


 int main () {
    char line [1024];
    FILE *fp = fopen("filename.txt", "r"); 
    if (fp == NULL) {
        return 1;
    }
    while (fgets(line, 1024, fp)) {
        if (feof (fp)) {
            break;
        }
        printf("%s\n", line);
    }
    return 0;
}
