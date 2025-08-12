int main (int argc, char **argv) {
    char *fname = strdup (argv[1]);
    char *outdir = argv[1];
    char *dotpos;
    int new_size = strlen (fname) + strlen (extra);
    char *new_fname = malloc (new_size);
    dotpos = strchr (fname, '.');
    if (dotpos)
        *dotpos = '\0';
    new_fname = malloc (new_size);
    snprintf (new_fname, new_size, "%s%s", fname, extra);
    printf ("%s\n", new_fname);
    return 0;
}


 
int main (int argc, char** argv) {
    char *fname = strdup(argv[1]);
    char *outdir = argv[1];

    //get length of fname and extra
    int len_fname = strlen(fname);
    int len_extra = strlen(".copy");

    //allocating memory for the new_file_name
    char *new_fname = (char*)malloc(len_fname + len_extra);
    
    //Get index of '.'
    char *dotpos = strchr(fname, '.');

    //terminate the string if '.' was found
    //If no '.' was found it will just affect the last char of the string
    if(dotpos)
       *dotpos = '\0';

   //copy fname and ".copy" to the new_fname
    snprintf(new_fname, len_fname + len_extra, "%s%s", fname, ".copy");

    printf("%s\n",new_fname);

    //free memory
    free(fname);
    free(new_fname);

    return 0;
}


