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
    
	//Access to the file name and new output directory
	char *fname = strdup(argv[1]);
	char *outdir = argv[1];

	//int to determine size of the new file name
    int new_length = strlen(fname) + strlen(".copy");
    
    //Allocate memory for the new file name
    char *new_fname = (char *)malloc(new_length + 1);
    new_fname[new_length] = '\0';
    
    //Get pointer to '.' character location
	char *dotpos = strchr(fname, '.');
    
    //Terminate string if pointer to '.' is not null
    if (dotpos) {
		*dotpos = '\0';
	}
	
	//Copy fname and ".copy"
    snprintf(new_fname, new_length, "%s%s", fname, ".copy");
    
    //Print output
    printf("%s\n", new_fname);
    
    //Free memory
    free(fname);
    free(new_fname);
	
	return 0;
}


