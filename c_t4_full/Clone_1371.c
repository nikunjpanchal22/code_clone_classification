void main () {
    int i, p, index, arr [40];
    for (i = 2; index = 0, i <= 40; i++, index++) {
        p = prime (i);
        if (p == 1)
            arr[index] = i;
        else
            arr[index] = 0;
        printf ("%d\n", arr [index]);
    }
}





void main(){
	int arr[40];
	for(int i=2, index=0; index<sizeof(arr)/sizeof(arr[0]); i++,index++){
		int p=prime(i);
		arr[index] = p==1?i:0;
		printf("%d\n", arr[index]);
	}
}


