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
int main () {
    char n[20];
    unsigned long nbr;
    int length;
    printf ("Enter:");
    char buf[100];
    fgets (buf, sizeof buf, stdin); 
    int t[2];
    if (sscanf (buf, "%19s %n%lu%n", n, &t[0], &nbr, &t[1]) != 2) {
        puts("Wrong Input!");
        return 1;
    }
    length = t[1] - t[0];
    printf ("%s %0*lu\n", n, length, nbr);
    return 0;
}


