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
    char **token_ptr = tokenize ("test string.");
    char **tokens = token_ptr;
    while (*token_ptr) {
        printf ("%s\n", *token_ptr);
        free (*token_ptr);
        token_ptr++;
    }
    free (tokens);
    return 0;
}


