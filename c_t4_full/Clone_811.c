int main (int argc, char *argv []) {
    int arr [5];
    int i;
    for (i = 0; i < 5; i++)
        arr[i] = 0;
    printf ("Before: ");
    for (i = 0; i < sizeof (int) * 5; i++)
        printf ("%2.2X ", ((char *) arr)[i]);
    printf ("\n");
    ((short *) (((char *) (&arr[1])) + 8))[3] = 100;
    printf ("After: ");
    for (i = 0; i < sizeof (int) * 5; i++)
        printf ("%2.2X ", ((char *) arr)[i]);
    printf ("\n");
    return 0;
}


 int main (int argc, char *argv []) {
    int arr [5] = {0, 0, 0, 0, 0}; 
    int i;
	printf ("Before: ");
	for (int j=0; j < 5; j++)
		printf ("  %d  ", arr[j]);
	printf ("\n");
	
	*((short *) &arr[2] + 4) = 100;

    printf ("After: ");
	for (int j=0; j < 5; j++)
		printf ("  %d  ", arr[j]);
	printf ("\n");
	return 0;
}


