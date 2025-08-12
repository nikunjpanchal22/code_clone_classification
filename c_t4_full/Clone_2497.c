int main () {
    int blah = 1;
    int *blah1 = &blah;
    int **blah2 = &blah1;
    int ***blah3 = &blah2;
    int ****blah4 = &blah3;
    int *****blah5 = &blah4;
    int ******blah6 = &blah5;
    int *******blah7 = &blah6;
    int ********blah8 = &blah7;
    int *********blah9 = &blah8;
    mega_pointer (blah9);
    return 0;
}


 

void mega_pointer(char *********p);
int main () {
    char blah = 'a';
    char *blah1 = &blah;
    char **blah2 = &blah1;
    char ***blah3 = &blah2;
    char ****blah4 = &blah3;
    char *****blah5 = &blah4;
    char ******blah6 = &blah5;
    char *******blah7 = &blah6;
    char ********blah8 = &blah7;
    char *********blah9 = &blah8;
    mega_pointer (blah9);
    return 0;
}


