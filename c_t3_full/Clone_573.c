int main () {
    int i = 0, N, sum = 0;
    scanf ("%d", & N);
    int ar [N];
    for (i = 0; i < N; i++) {
        scanf ("%d", & ar [i]);
    }
    for (i = 0; i < N; i++) {
        sum = sum + ar[i];
    }
    printf ("%d\n", sum);
    return 0;
}


int main(){
   int N,i,sum=0;
    scanf("%d",&N);
   int ar[N];
    for(i=0;i<N;i++){
        scanf("%d",&ar[i]);
        sum+=ar[i];
    }
    printf("%d\n",sum);
    return 0;
}


