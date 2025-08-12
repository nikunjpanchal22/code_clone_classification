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
    int num_sections = 12;
    char *founder = NULL;
    char *saver = NULL;
   for (int i = 0; i < num_sections; i++) {
        char *section = some_hash_table.pop (i);
        asprintf (& founder, "%s%s", (saver == NULL ? "" : saver), section);
        if (saver)
            free (saver);
        saver = founder;
   }
   printf ("%s\n", founder);
   free (founder);
   return 0;
}
