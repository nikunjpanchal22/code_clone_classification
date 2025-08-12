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
    for (int num_tokens = 0; *(tokens + num_tokens) != NULL; ++num_tokens) {
        printf ("%s\n", *(tokens + num_tokens));
        free (*(tokens + num_tokens));
    }
    tokens -= num_tokens;
    free (tokens);
    return 0;
}


