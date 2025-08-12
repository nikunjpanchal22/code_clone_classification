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
    struct stat st; 
    stat(fname, &st); 
    char *content = (char*)malloc(st.st_size + 1); 
    content[st.st_size] = 0; 
    FILE *infile = fopen(fname, "rb"); 
    size_t read = fread(content, 1, st.st_size, infile); 
    fclose(infile); 
    puts(content); 
    return 0; 
}
