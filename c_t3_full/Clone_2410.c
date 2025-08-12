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





#include<stdio.h>
void main() {
    char User[20];
    unsigned long long Count;
    int Count_len;
    printf("Enter ");
    char str[100];
    fgets(str, sizeof str, stdin);
    int n[2];
    if(sscanf(str, "%19s %n%llu%n", User, &n[0], &Count, &n[1]) !=2) {
        printf("Incorrect Input \n");
    }
    Count_len = n[1] - n[0];
    printf("%s %0*llu \n", User, Count_len, Count);
}


