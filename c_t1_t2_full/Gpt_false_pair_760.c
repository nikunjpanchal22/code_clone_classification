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


 int main(void) {
	const char *string = "A > B";
	char lho[100];
	char op[3];
	char rho[100];
	if (sscanf(string, "%99[^><]%2[=><]%99[^><]", lho, op, rho) == 3) {
		int lhok = strlen(lho);
		int rhod = strlen(rho);
		if (lhok > 0 && rhod > 0 && op[0] != '\0' && op[1] != '\0') {
			fprintf(stdout, "left hand operand: %s\n", lho);
			fprintf(stdout, "operator: %s\n", op);
			fprintf(stdout, "right hand operand: %s\n", rho);
		}
	}
	return 0;
}
