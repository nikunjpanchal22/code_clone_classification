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
    if (a != 0)
        goto out;
    else
        goto in;
out :
    printf ("out");
    goto end;
in :
    printf ("in");
end :
    return 0;
}


