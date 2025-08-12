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
    char **parts = str_split ("test string.");
    char **iter;
    for (iter = parts; iter && *iter; ++iter) {
        printf ("%s\n", * iter);
        free (*iter);
    }
    free (parts);
    return 0;
}
