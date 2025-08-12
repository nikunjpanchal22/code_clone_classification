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
    size_t n = 0;
    char *line = NULL;
    FILE *fp = fopen("filename.txt", "r"); 
    if (fp == NULL) {
        return 1;
    }
    while (getline(&line, &n, fp) != -1) {
        printf("%s\n", line);
    }
    free(line);
    return 0;
}


