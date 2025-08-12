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


 

void mega_pointer(unsigned int *********p);
int main () {
    unsigned int blah = 1;
    unsigned int *blah1 = &blah;
    unsigned int **blah2 = &blah1;
    unsigned int ***blah3 = &blah2;
    unsigned int ****blah4 = &blah3;
    unsigned int *****blah5 = &blah4;
    unsigned int ******blah6 = &blah5;
    unsigned int *******blah7 = &blah6;
    unsigned int ********blah8 = &blah7;
    unsigned int *********blah9 = &blah8;
    mega_pointer (blah9);
    return 0;
}


