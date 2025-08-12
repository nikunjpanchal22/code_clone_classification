int main (int argc, char **argv) {
    char *fname = "./someFileNameHere";
    struct stat st;
    stat (fname, & st);
    char *content = malloc (st.st_size + 1);
    content[st.st_size] = 0;
    FILE *infile = fopen (fname, "rb");
    size_t read = fread (content, sizeof (char), st.st_size, infile);
    fclose (infile);
    puts (content);
    return 0;
}


  int main(int argc, char **argv) {
    char *fname = "./exampleFile.txt"; 
    int fsize=0;
    FILE *infile = fopen(fname, "rb"); 
    fseek(infile, 0, SEEK_END); 
    fsize = ftell(infile); 
    rewind(infile);
    char *content = malloc(fsize + 1);
    fread(content, 1, fsize, infile); 
    fclose(infile); 
    content[fsize] = 0; 
    printf("%s", content);
    return 0; 
}


