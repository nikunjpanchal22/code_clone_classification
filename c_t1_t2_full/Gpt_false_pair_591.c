int main (void) {
    char *line1 = NULL, *line2 = NULL;
    size_t size1 = 0, size2 = 0;
    getline (& line1, & size1, stdin);
    getline (& line2, & size2, stdin);
    size_t len1, len2;
    char **array1 = split (line1, " \t\n", &len1);
    char **array2 = split (line2, " \t\n", &len2);
    qsort (array1, len1, sizeof (* array1), cmp);
    qsort (array2, len2, sizeof (* array2), cmp);
    find_diff (array1, array2);
    drop (array1);
    drop (array2);
    free (line1);
    free (line2);
    return 0;
}


 int main(void) {
   char *line1 = NULL, *line2 = NULL;
   size_t size1 = 0, size2 = 0;
   
   getline(&line1, &size1, stdin);
   getline(&line2, &size2, stdin);
   
   size_t len1, len2;
   
   char **array1 = split(line1, " \t\n", &len1);
   char **array2 = split(line2, " \t\n", &len2);
   
   qsort(array1, len1, sizeof(*array1), cmp);
   qsort(array2, len2, sizeof(*array2), cmp);
   
   detect_differences(array1, array2);
   
   free(line1);
   free(line2);
   
   drop(array1);
   drop(array2);
   
   return 0;
}
