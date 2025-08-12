int main () {
    char **tokens = tokenize ("test string.");
    char **it;
    for (it = tokens; it && *it; ++it) {
        printf ("%s\n", * it);
        free (*it);
    }
    free (tokens);
    return 0;
}


int main () {
    char **segments = parse ("test string.");
    char **ptr;
    for (ptr = segments; ptr && *ptr; ++ptr) {
        printf ("%s\n", * ptr);
        free (*ptr);
    }
    free (segments);
    return 0;
}
