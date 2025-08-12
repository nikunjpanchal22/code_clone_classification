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
    size_t line_length = 0;
    char *line = malloc(line_length);
    getline(&line, &line_length, stdin);
    char *dup_line = malloc(line_length);
    strcpy(dup_line, line);
    dup_line[line_length-1] = '\0';
    puts(dup_line);
    free(line);
    free(dup_line);
    line = NULL;
    dup_line = NULL;
    return 0;
}


