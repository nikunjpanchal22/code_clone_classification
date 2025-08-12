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
    int quantity_segments = 12;
    char *all_string = NULL;
    char *carry_over = NULL;
    for (int i = 0; i < quantity_segments; i++) {
        char *segment = some_hash_table.pop (i);
        asprintf (& all_string, "%s%s", (carry_over == NULL ? "" : carry_over), segment);
        if (carry_over)
            free (carry_over);
        carry_over = all_string;
    }
    printf ("%s\n", all_string);
    free (all_string);
    return 0;
}
