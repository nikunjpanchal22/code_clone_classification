int main () {
    int a = -1;
    if (a < 0)
        goto in;
out :
    printf ("out");
in :
    printf ("in");
    return 0;
}



int main () {
    int a = -1;
    if (a > 0)
        goto out;
in :
    printf ("in");
    goto finish;
out :
    printf ("out");
    goto in;
finish : 
    return 0;
}


