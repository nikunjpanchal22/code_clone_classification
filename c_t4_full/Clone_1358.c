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
	    int v1 [3], v2 [3], v3 [3];
	    int i = 0;

	    while (i < 3) {
		printf("Enter a number: ");
		scanf("%d", &v1[i]);
		i++;
	    }

	    i = 0;
	    while (i < 3) {
		printf("Enter a number: ");
		scanf("%d", &v2[i]);
		i++;
	    }

	    i = 0;
	    while (i < 3) {
		v3[i] = v1[i] + v2[i];
		printf("Sum: %d\n", v3[i]);
		i++;
	    }
}


