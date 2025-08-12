int main (void) {
    char line [MAXS] = {0};
    while (fgets (line, MAXS, stdin) != NULL) {
        char *p = line;
        size_t len = strlen (line);
        while (len > 0 && (line[len - 1] == '\n' || line[len - 1] == '\r'))
            line[--len] = 0;
        while (isspace (*p))
            p++;
        if (*p == '#' || *p == '@' || !*p)
            continue;
        printf ("%s\n", line);
    }
    return 0;
}



int main (void) {
    char line [MAXS] = {0};
    while (fgets (line, MAXS, stdin) != NULL) {
        int pos = 0;
        while (isspace (line[pos]) && line [pos] != 0){
            ++pos;
        }
        if (line[pos] == 0 || line[pos] == '@' || line[pos] == '#')
            continue;
        int i = strlen (line) - 1;
        while (line[i] == '\n' || line[i] == '\r')
            --i;
        line[i+1] = '\0';
        printf ("%s\n", line+pos);
    }
    return 0;
}


