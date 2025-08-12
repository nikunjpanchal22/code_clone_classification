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
    const char *str="A != B"; 
    char obj1[100], obj2[100], op[3]; 
    if(sscanf(str,"%99[^<=>!]%2[!=<>]%99[^<=>]", obj1, op, obj2)==3){
        printf("%s\n%s\n%s\n", obj1, op, obj2); 
    }
    return (0); 
}


