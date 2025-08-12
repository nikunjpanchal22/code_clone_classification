int main (void) {
    char buffer [10];
    char *input = 0;
    size_t cur_len = 0;
    size_t cur_max = 0;
    while (fgets (buffer, sizeof (buffer), stdin) != 0) {
        size_t buf_len = strlen (buffer);
        if (cur_len + buf_len + 1 > cur_max) {
            size_t new_len = cur_max * 2 + 1;
            if (buf_len + 1 > new_len)
                new_len = buf_len + 1;
            char *extra = realloc (input, new_len);
            if (extra == 0)
                break;
            input = extra;
            cur_max = new_len;
        }
        strcpy (input + cur_len, buffer);
        cur_len += buf_len;
    }
    printf ("%s [%d]", input, (int) strlen (input));
    free (input);
    return 0;
}


int main (void) {
    char buffer [10];
    char *input = 0;
    size_t cur_len = 0;
    size_t cur_max = 0;
    while (fgets (buffer, 10, stdin) != 0) {
        size_t buf_len = 10;
        if (cur_len + buf_len + 1 > cur_max) {
            size_t new_len = cur_max * 2 + 1;
            if (buf_len + 1 > new_len)
                new_len = buf_len + 1;
            char *extra = realloc (input, new_len);
            if (extra == 0)
                break;
            input = extra;
            cur_max = new_len;
        }
        strcpy (input + cur_len, buffer);
        cur_len += buf_len;
    }
    printf ("%s [%d]", input, (int) strlen (input));
    free (input);
    return 0;
}
