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
    
    switch (a) {
        case -1:
            printf ("in");
            break;
        default:
            printf ("out");
            break;
    }
    return 0;
}


