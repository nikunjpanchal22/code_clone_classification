int main () {
    int v [100], w [100], n, i;
    bool check [1000001];
    printf ("n= ");
    scanf ("%d", & n);
    int j = 0;
    for (i = 0; i < n; i++) {
        printf ("v[%d]= ", i);
        scanf ("%d", & v [i]);
        if (!check[v[i]]) {
            check[v[i]] = true;
            w[j] = v[i];
            j++;
        }
    }
    printf ("the distinct elements are: \n");
    for (i = 0; i < j; i++)
        printf ("%d\n", w[i]);
    return 0;
}


	int main()
{
    int v[100], w[100], n, i;
    bool check[1000001];
    printf("n= ");
    scanf("%d",&n);
    int j = 0;
    for(i = 0;i<n;i++)
    {
        printf("v[%d]= ",i);
        scanf("%d",&v[i]);
        if(check[v[i] + 1] != true)
        {
            check[v[i]] = true;
            w[j] = v[i];
            j++;
        }
    }
    printf("the distinct elements are: \n");
    for(i = 0;i<j;i++)
        printf("%d\n",w[i]);
    return 0;
}
