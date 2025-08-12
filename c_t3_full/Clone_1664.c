int main (void) {
    char *line = NULL;
    size_t count;
    char *dup_line;
    getline (& line, & count, stdin);
    dup_line = strdup (line);
    puts (dup_line);
    free (dup_line);
    free (line);
    return 0;
}


 int main (void) { 
    int n;
    char *line = malloc(n);
    fgets (line, n, stdin);
    char *dup_line = malloc(n);
    strcpy(dup_line, line);
    puts(dup_line);
    free(line);
    free(dup_line);
    return 0;
}


