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


 

void mega_pointer(long long *********p);
int main () {
    long long blah = 1LL;
    long long *blah1 = &blah;
    long long **blah2 = &blah1;
    long long ***blah3 = &blah2;
    long long ****blah4 = &blah3;
    long long *****blah5 = &blah4;
    long long ******blah6 = &blah5;
    long long *******blah7 = &blah6;
    long long ********blah8 = &blah7;
    long long *********blah9 = &blah8;
    mega_pointer (blah9);
    return 0;
}


