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
    char *token;
    while ((token = *tokens++) != NULL) {
        printf ("%s\n", token);
        free (token);
    }
    free (tokens);
    return 0;
}


