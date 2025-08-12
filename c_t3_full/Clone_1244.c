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
    int length,sum=0,num;
    char str[128];
    printf("Enter numbers: ");
    scanf("%127[^\n]",str);
    char* p = str;
    while(sscanf(p,"%d%n",&num,&length)==1){
        sum+=num;
        p+=length;
    }
    printf("sum: %d\n",sum);
    return 0;
}


