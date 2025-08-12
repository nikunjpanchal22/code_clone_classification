int main (void) {
    char line [128], *p = line;
    int sum = 0, len, n;
    printf ("enter numbers: ");
    scanf ("%127[^\n]", line);
    while (sscanf (p, "%d%n", &n, &len) == 1) {
        sum += n;
        p += len;
    }
    printf ("sum: %d\n", sum);
    return 0;
}


 int main()
{
	char str[128];
	int len,sum = 0,n;
	printf("Enter numbers: ");
	fgets(str, sizeof str, stdin);
	char *p = str;
	while(sscanf(p, "%d%n",&n,&len) == 1){
		sum += n;
		p += len;
	}
	printf("Sum: %d\n",sum);
	return 0;
}


