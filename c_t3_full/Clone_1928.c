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
        size_t length = strlen (line);
        while (length > 0 && (line[length - 1] == '\n' || line[length - 1] == '\r'))
            line[--length] = 0;
        char *p = line;
        int pos = 0;
        while (isspace (p[pos]) && p[pos] != 0)
            ++pos;
        if (p[pos] == 0 || p[pos] == '@' || p[pos] == '#')
            continue;
        printf ("%s\n", line + pos);
    }
    return 0;
}


