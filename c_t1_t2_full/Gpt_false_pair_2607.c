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
    int foo = 1;
    int *foo1 = &foo;
    int **foo2 = &foo1;
    int ***foo3 = &foo2;
    int ****foo4 = &foo3;
    int *****foo5 = &foo4;
    int ******foo6 = &foo5;
    int *******foo7 = &foo6;
    int ********foo8 = &foo7;
    int *********foo9 = &foo8;
    mega_pointer (foo9);
    return 0;
}
