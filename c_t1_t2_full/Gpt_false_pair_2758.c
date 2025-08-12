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
out :
    printf ("out");
    return 0;
}
