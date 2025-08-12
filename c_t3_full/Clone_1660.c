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
    char *line = NULL;
    size_t capacity = 0;
    size_t count = getline(&line, &capacity, stdin);
    char *dup_line = malloc(count);
    dup_line = strcpy(dup_line, line);
    puts(dup_line);
    free(line);
    line = NULL;
    free(dup_line);
    dup_line = NULL;
    return 0;
}


