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
    int separate_fragments_count = 12;
    char *collective_string = NULL;
    char *storehouse = NULL;
    for (int i = 0; i < separate_fragments_count; i++) {
        char *separate_fragment = some_hash_table.pop (i);
        asprintf (& collective_string, "%s%s", (storehouse == NULL ? "" : storehouse), separate_fragment);
        if (storehouse)
            free (storehouse);
        storehouse = collective_string;
    }
    printf ("%s\n", collective_string);
    free (collective_string);
    return 0;
}
