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


 int main(void){
	const char *string = "A > B";
	char lho[100];
	char op[3];
	char rho[100];
	int lh_length, op_length, rh_length;
	int n = 0;
	n = sscanf(string, "%99[^ ><=]%2[ ><=]%99[^ ><=]", lho, op, rho);
	lh_length=strlen(lho);
	op_length=strlen(op);
	rh_length=strlen(rho);
	
	if (n == 3 && lh_length > 0 && op_length == 2 && rh_length > 0){
		fprintf(stdout, "left hand operand: %s\n", lho);
		fprintf(stdout, "operator: %s\n",op);
		fprintf(stdout, "right hand operand: %s\n", rho);
	}
	return 0;
}


