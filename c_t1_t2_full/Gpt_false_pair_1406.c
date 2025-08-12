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
    int number_of_separate_parts = 12;
    char *final_string = NULL;
    char *auxillary = NULL;
    for (int i = 0; i < number_of_separate_parts; i++) {
        char *separate_part = some_hash_table.pop (i);
        asprintf (& final_string, "%s%s", (auxillary == NULL ? "" : auxillary), separate_part);
        if (auxillary)
            free (auxillary);
        auxillary = final_string;
    }
    printf ("%s\n", final_string);
    free (final_string);
    return 0;
}
