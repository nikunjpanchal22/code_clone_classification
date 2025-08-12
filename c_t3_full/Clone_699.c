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


 int main (void) {
	char lho [100];
	char op [3];
	char rho [100];
	const char *string = "A > B";
	int x = 0;
	while (x < 3) {
		if (x == 0) {
			sscanf(string, "%99[^ ><=]%c", lho, &op[x]);
		} else if (x == 1) {
			sscanf(string, "%c%99[^ ><=]", &op[x], rho);
		}
		x++;
	}
	if (sscanf (string, "%99[^=><]%2[=><]%99[^=><]", lho, op, rho) == 3) {
		fprintf (stdout, "left hand operand: %s\n", lho);
		fprintf (stdout, "operator: %s\n", op);
		fprintf (stdout, "right hand operand: %s\n", rho);
	}
	return 0;
}


