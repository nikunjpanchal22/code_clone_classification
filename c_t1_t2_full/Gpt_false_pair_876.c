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
    char **tokens = tokenize ("test string.");
    while (*tokens != NULL) {
        printf ("%s\n", *tokens);
        free (*tokens);
        tokens++;
    }
    free (tokens);
    return 0;
}
