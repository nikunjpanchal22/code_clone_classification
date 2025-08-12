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
        char *p = line;
        size_t len = strlen (line);
        for (int i = 0; i < len; i++){
            if (line[i] == '\n' || line[i] == '\r')
                line[i] = 0;
        }
        while (isspace (*p))
            p++;
        if (!*p || *p == '@' || *p == '#')
            continue;
        printf ("%s\n", line);
    }
    return 0;
}


