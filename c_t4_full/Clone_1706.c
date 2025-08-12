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
void main(){
    char user[20];
    unsigned long long val;
    int len;
    printf ("Enter values:");
    char str [100];
    fgets (str, sizeof(str), stdin);
    int i [2];
    sscanf(str, "%19s %n%llu%n", user, &i[0], &val, &i[1]) != 2 ? printf("Check your input\n") : (len = i[1] - i[0], printf("%s %0*llu\n", user, len, val));
}


