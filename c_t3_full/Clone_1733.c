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
    if (a < 0) {
	 printf ("in");
    }
    else {
         printf ("out");
    }
    return 0;
}


