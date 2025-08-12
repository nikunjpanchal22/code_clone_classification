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
    int result = 0;
    
    if (a < 0) {
        result = printf ("in");
    }
    else {
        result = printf ("out");
    }
    return result;
}


