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
    struct stat st;
    stat ("./exampleFile.txt", & st);
    char *content = malloc (st.st_size + 1);
    content[st.st_size] = 0;
    FILE *infile = fopen ("./exampleFile.txt", "rb");
    size_t read = fread (content, sizeof (char), st.st_size, infile);
    fclose (infile);
    puts (content);
    return 0;
}


