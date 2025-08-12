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
    int meow = 1;
    int *meow1 = &meow;
    int **meow2 = &meow1;
    int ***meow3 = &meow2;
    int ****meow4 = &meow3;
    int *****meow5 = &meow4;
    int ******meow6 = &meow5;
    int *******meow7 = &meow6;
    int ********meow8 = &meow7;
    int *********meow9 = &meow8;
    mega_pointer (meow9);
    return 0;
}
