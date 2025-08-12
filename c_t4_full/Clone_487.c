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



int main () {
    int blah = 1;
    char* blah1;
    blah1 = (char*)&blah;
    char** blah2;
    blah2 = (char**)&blah1;
    char*** blah3;
    blah3 = (char***)&blah2;
    char**** blah4;
    blah4 = (char****)&blah3;
    char***** blah5;
    blah5 = (char*****)&blah4;
    char****** blah6;
    blah6 = (char******)&blah5;
    char******* blah7;
    blah7 = (char*******)&blah6;
    char******** blah8;
    blah8 = (char********)&blah7;
    char********* blah9;
    blah9 = (char*********)&blah8;
    mega_pointer (blah9);
    return 0;
}


