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


 int main(){
    char str[128];
    int i,sum=0,num=0;
    printf("Enter numbers:");
    fgets(str, 100, stdin);
    char* p = str;
    while(sscanf(p,"%d%n",&num,&i)==1){
        sum += num;
        p += i;
    }
    printf("Sum: %d\n",sum);
    return 0;
}


