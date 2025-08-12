int main () {
    int n;
    scanf ("%d ", & n);
    char a [100] [10];
    for (int i = 0; i < n; i++) {
        fgets (a [i], 10, stdin);
    }
    return 0;
}


 int main()
{
    int n;
    scanf("%d", &n);
    int c;
    char a[100][10] = {0};
    for (int i = 0; i < n; i++){
		int j = 0;
        while((c = getchar()) != '\n'){
        	if(j < 10) a[i][j++] = (char)c;
        }
        a[i][j] = '\0';
        if(j > 9){
			printf("Error\n");
            return 1;
        }
    }
    return 0;
}


