int main (void) {
    char nme [20];
    unsigned long long nmbr;
    int nmbr_len;
    printf ("Enter:");
    char buf [100];
    fgets (buf, sizeof buf, stdin);
    int n [2];
    if (sscanf ("%19s %n%llu%n", nme, &n[0], &nmbr, &n[1]) != 2) {
        Handle_BadInput ();
    }
    nmbr_len = n[1] - n[0];
    printf ("%s %0*llu\n", nme, nmbr_len, nmbr);
    return 0;
}





#include <stdio.h>
void main() {
    char x[20];
    unsigned long long y;
    int z;
    printf("Enter data:");
    char i[100];
    fgets(i, sizeof(i), stdin);
    int p[2];
    sscanf(i, "%19s %n%llu%n", x, &p[0], &y, &p[1]) != 2 ? printf("Input error \n") : (z = p[1] - p[0], printf("%s %0*llu\n", x, z, y));
}


