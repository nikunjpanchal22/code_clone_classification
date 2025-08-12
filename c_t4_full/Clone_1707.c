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
main() {
    char nam[20]; 
    unsigned long long num; 
    int len;
    printf("Enter:");
    char str[100]; 
    fgets (str, sizeof(str), stdin); 
    int i[2]; 
    sscanf(str, "%19s %n%llu%n", nam, &i[0], &num, &i[1]) !=2 ? printf("Please check your input \n") : (len = i[1]-i[0], printf("%s %0*llu\n", nam, len, num));
}


