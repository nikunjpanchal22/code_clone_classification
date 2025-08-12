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
    char name[20];
    unsigned long long number;
    int number_len;
    printf("Enter : ");
    char buffer[100];
    fgets(buffer, sizeof buffer, stdin);
    int count[2];
    if(sscanf(buffer, "%19s %n%llu%n", name, &count[0], &number, &count[1]) != 2)  {
        printf("Input Error");
    }
    number_len = count[1] - count[0];
    printf("%s %0*llu \n", name, number_len, number);
}


