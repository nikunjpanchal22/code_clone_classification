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
    for (int i = 0; *(tokens + i) != NULL; ++i, ++num_tokens) {
        printf ("%s\n", *(tokens + i));
        free (*(tokens + i));
    }
    tokens -= num_tokens;
    free (tokens);
    return 0;
}


