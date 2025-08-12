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
    while (fgets (line, 1024, fp)) {
        size_t length = strlen(line);
        if (line[length - 1] == '\n') {
            line[length - 1] = '\0';
        }
        printf("%s\n", line);
    }
    return 0;
}


