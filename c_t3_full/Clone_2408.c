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
    char name[20]; 
    unsigned long long number; 
    int length;
    printf("Input : ");
    char buf[100];
    fgets (buf, sizeof(buf), stdin); 
    int fulldata[2];
    if (sscanf (buf, "%19s %n%llu%n", name, &fulldata[0], &number, &fulldata[1]) !=2) {
        printf("Invalid input data \n");
        }
    length = fulldata[1] - fulldata[0];
    printf ("%s %0*llu\n", name, length, number);
}


