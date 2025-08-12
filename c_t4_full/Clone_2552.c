int main () {
    char months [] = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
    char **tokens;
    printf ("months=[%s]\n\n", months);
    tokens = str_split (months, ',');
    if (tokens) {
        int i;
        for (i = 0; *(tokens + i); i++) {
            printf ("month=[%s]\n", * (tokens + i));
            free (* (tokens + i));
        }
        printf ("\n");
        free (tokens);
    }
    return 0;
}





char** str_split(char* a_str, const char a_delim) {
    int idx;
    char** res = 0;
    const char* pch = myStrtok(a_str, a_delim, &idx);
    size_t count = 0;

    while (pch) {
        res = realloc(res, sizeof(char*) * ++count);

        if (res) {
            res[count-1] = pch;
        }

        pch = myStrtok(0, a_delim, &idx);
    }
    res = realloc(res, sizeof(char*) * ++count);
    res[count-1] = 0;
    return res;
}


