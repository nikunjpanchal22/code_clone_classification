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



#include <stdio.h>
#include <sys/stat.h>
#include <stdlib.h>

int main(int argc, char **argv) {
    char *fname = "./someFileNameHere";
    struct stat st;
    stat(fname, &st);
    char *content = calloc(st.st_size + 1, sizeof(char));
    FILE *infile = fopen(fname, "rb");
    size_t read = fread(content, 1, st.st_size, infile);
    fclose(infile);
    printf("%s", content);
    free(content);
    return 0;
}


