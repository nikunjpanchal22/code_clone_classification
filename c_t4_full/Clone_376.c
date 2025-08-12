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
    int i = 0;
    while (tokens[i] != NULL) {
        printf ("%s\n", tokens[i]);
        free (tokens[i]);
        i++;
    }
    free (tokens);
    return 0;
}


