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
        size_t len = strlen (line);
        while (line[len-1] == '\n' || line[len-1] == '\r')
            line[--len] = 0;
        char *ptr = line;
        while (isspace (*ptr))
            ptr++;
        if (*ptr == '#' || *ptr == '@' || !*ptr)
            continue;
        printf ("%s\n", line);
    }
    return 0;
}
