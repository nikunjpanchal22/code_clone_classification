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
int main(){ 
    const char *string = "A < B";
    char lho[100], op[3], rho[100]; 
    if(sscanf(string, "%99s %2s %99s", lho, op, rho) == 3){
        printf("%s\n%s\n%s\n", rho, op, lho); 
    } 
    return 0;
}


