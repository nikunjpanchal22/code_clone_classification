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
    size_t count = 0;
    char *line = calloc(1, count);
    getline(&line, &count, stdin);
    char *dup_line = malloc(strlen(line));
    strcpy(dup_line, line);
    puts(dup_line);
    free(line);
    free(dup_line);
    return 0;
}


