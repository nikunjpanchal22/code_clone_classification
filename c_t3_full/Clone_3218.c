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
    if (1)
        goto out;
    else
        goto in;
out :
    printf ("out");
    goto in;
in :
    printf ("in");
    return 0;
}


