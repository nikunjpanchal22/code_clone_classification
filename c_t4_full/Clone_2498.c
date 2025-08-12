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


 

void mega_pointer(double *********p);
int main () {
    double blah = 1.0;
    double *blah1 = &blah;
    double **blah2 = &blah1;
    double ***blah3 = &blah2;
    double ****blah4 = &blah3;
    double *****blah5 = &blah4;
    double ******blah6 = &blah5;
    double *******blah7 = &blah6;
    double ********blah8 = &blah7;
    double *********blah9 = &blah8;
    mega_pointer (blah9);
    return 0;
}


