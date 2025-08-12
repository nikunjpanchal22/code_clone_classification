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





main(){
	int arr[40], i=2, index=0;
	do{
		arr[index]=prime(i)==1 ? i:0;
		printf("%d\n", arr[index]);
		index++; i++;
	}while(index<40);
}


