int main () {
    int v1 [3], v2 [3], v3 [3], i;
    for (i = 0; i < 3; i++) {
        printf ("Type a number : \n");
        scanf ("%d", & v1 [i]);
    }
    for (i = 0; i < 3; i++) {
        printf ("Type a number : \n");
        scanf ("%d", & v2 [i]);
    }
    for (i = 0; i < 3; i++) {
        v3[i] = v1[i] + v2[i];
        printf ("Total : %d\n", v3 [i]);
    }
}





int main () {
	    int num1, num2, sum, i;
	    int v1[3], v2[3], v3[3]; 

	    for (i = 0; i < 3; i++) {
		printf("Enter a number: ");
		scanf("%d", &num1);
		v1[i] = num1;
	    }
	    for (i = 0; i < 3; i++) {
		printf("Enter a number: ");
		scanf("%d", &num2);
		v2[i] = num2;
	    }
	    for (i = 0; i < 3; i++) {
		sum = v1[i] + v2[i];
		v3[i] = sum;
		printf("The sum is: %d\n", v3[i]);
	    }
}


