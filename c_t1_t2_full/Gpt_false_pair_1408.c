int main (int argc, char *argv []) {
    int i;
    int number_of_chunks = 12;
    char *final_string = NULL;
    char *tmp = NULL;
    for (i = 0; i < number_of_chunks; i++) {
        char *chunk = some_hash_table.pop (i);
        asprintf (& final_string, "%s%s", (tmp == NULL ? "" : tmp), chunk);
        if (tmp)
            free (tmp);
        tmp = final_string;
    }
    printf ("%s\n", final_string);
    free (final_string);
    return 0;
}


 int main (int argc, char *argv []) {
    int numb_pieces = 12;
    char *total_string = NULL;
    char *summator = NULL;
    for (int i = 0; i < numb_pieces; i++) {
        char *piece = some_hash_table.pop (i);
        asprintf (& total_string, "%s%s", (summator == NULL ? "" : summator), piece);
        if (summator)
            free (summator);
        summator = total_string;
    }
    printf ("%s\n", total_string);
    free (total_string);
    return 0;
}
