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


 int main() {
    int a = -1;
    while (a >= 0) {
        printf ("in");
        a++;
    }
    printf ("out");
    return 0;
}


