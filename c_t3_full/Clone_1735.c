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
    for (int i = 0; i <=a; i++) {
        printf ("in");
    }
    printf ("out");
    return 0;
}


