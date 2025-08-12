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
    char unme[20];
    unsigned long long nmbr;
    int nmbr_len;
    printf("Enter:");
    char bf [100];
    fgets (bf, sizeof bf, stdin);
    int n [2];
    if (sscanf (bf, "%19s %n%llu%n", unme, &n[0], &nmbr, &n[1]) != 2) {
        printf("Incorrect input, insert again.");
    }
    nmbr_len = n[1] - n[0];
    printf ("%s %0*llu\n", unme, nmbr_len, nmbr);
}


