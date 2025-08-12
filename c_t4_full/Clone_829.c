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
        int i = 0;
        while (isspace (line[i]) && i < len)
            ++i;
        if (line[i] == '#' || line[i] == '@' || i >= len)
            continue;
        int j = len - 1;
        while (line[j] == '\n' || line[j] == '\r')
            --j;
        line[j+1] = '\0';
        printf ("%s\n", line+i);
    }
    return 0;
}


