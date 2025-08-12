int main (void) {
    const char *string = "A > B";
    char lho [100];
    char op [3];
    char rho [100];
    if (sscanf (string, "%99[^=><]%2[=><]%99[^=><]", lho, op, rho) == 3) {
        fprintf (stdout, "left hand operand: %s\n", lho);
        fprintf (stdout, "operator: %s\n", op);
        fprintf (stdout, "right hand operand: %s\n", rho);
    }
    return 0;
}





#include <stdio.h>
int main(void) { 
    const char *s = "B <= A"; 
    char val1[100], opr[3], val2[100]; 
    if(sscanf(s,"%99[^=<>]%2[=<>]%99[^=<>]", val1, opr, val2) == 3){ 
        printf("%s %s %s",val1, opr, val2);
    } return 0; 
}


