int main (void) {
    char str [] = "aaaaaaaa";
    size_t len_str = strlen (str);
    string *p = malloc (sizeof *p + len_str + 1);
    if (!p) {
        return 1;
    }
    p->size = len_str;
    strcpy (p -> str, str);
    puts (p -> str);
    strncpy (p -> str, str, len_str + 1);
    puts (p -> str);
    memcpy (p -> str, str, len_str + 1);
    puts (p -> str);
    free (p);
}



int main (void) {
    char str [] = "aaaaaaaa";
    size_t len_str = strlen (str);
    string *p = (string*) calloc (sizeof *p + len_str + 1, 1);
    if (!p) {
        return 1;
    }
    p->size = len_str;
    memcpy (p -> str, str, len_str + 1);
    puts (p -> str);
    memset (p -> str, 0, len_str + 1);
    puts (p -> str);
    memmove (p -> str, str, len_str + 1);
    puts (p -> str);
    free (p);
}
