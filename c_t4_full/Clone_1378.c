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





void main (){
	for (int index=0, i=2, arr[40]; index<40; i++,index++){
		arr[index]=(prime(i))?i:0;
		printf("%d\n",arr[index]);
	}
}


