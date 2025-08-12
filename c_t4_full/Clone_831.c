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
        int len = strlen (line);
        if (line[len - 1] == '\n' || line[len - 1] == '\r')
            line[len - 1] = 0;
        int i = 0;
        while (isspace (line[i]) && line[i] != '\0')
            ++i;
        if (line[i] == '\0' || line[i] == '@' || line[i] == '#')
            continue;

        printf ("%s\n", line+i);
    }
    return 0;
}


