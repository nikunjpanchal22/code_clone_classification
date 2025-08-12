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





#include<stdio.h> 
int main (void) { 
    const char *string = "Dog > Cat";
    char lval [100];
    char oper [3];
    char rval [100]; 
    if (sscanf (string, "%99[^=><]%2[=><]%99[^=><]", lval, oper, rval) == 3) { 
        fputs(lval, stdout); 
        fputs(oper, stdout); 
        fputs(rval, stdout);
    } 
    return 0; 
}


