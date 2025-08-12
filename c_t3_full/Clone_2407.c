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
int main() {
    char name[20];
    unsigned long long num;
    int num_len;
    printf("Enter the details:");
    char details[100];
    fgets(details, sizeof(details), stdin);
    int len[2];
    if(sscanf(details, "%19s %n%llu%n", name, &len[0], &num, &len[1]) != 2){
        printf("Error! Try again...");
        return -1;
    }
    num_len = len[1] - len[0];
    printf("%s %0*llu\n", name, num_len, num);
    return 0;
}


