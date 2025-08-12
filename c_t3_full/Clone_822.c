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
    int num_tokens = 0;
    while (*tokens) {
        printf ("%s\n", *tokens);
        free (*tokens);
        num_tokens++;
        tokens++;
    }
    tokens -= num_tokens;
    free (tokens);
    return 0;
}


