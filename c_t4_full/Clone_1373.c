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
	int array[40]={0};
	for(int i=0, num=2; i<40; num++, i++){
		if(prime(num)==1){
			array[i]=num;
		}
		printf("%d\n", array[i]);
	}
}


