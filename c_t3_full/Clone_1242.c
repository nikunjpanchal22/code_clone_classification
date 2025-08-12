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
	char line[128],*p=line;
	int tot = 0,sum = 0,num = 0;
	printf("Enter numbers:");
	gets(line);
	printf("\n");
	while(sscanf(p,"%d%n",&num,&tot) == 1)	
	{
		sum += num;  
		p += tot;
	}
	printf("Sum: %d\n",sum);
	return 0;
}


