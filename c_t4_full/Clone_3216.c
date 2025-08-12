int main () {
    FILE *myFile;
    myFile = fopen ("somenumbers.txt", "r");
    int numberArray [16];
    int i;
    if (myFile == NULL) {
        printf ("Error Reading File\n");
        exit (0);
    }
    for (i = 0; i < 16; i++) {
        fscanf (myFile, "%d,", & numberArray [i]);
    }
    for (i = 0; i < 16; i++) {
        printf ("Number is: %d\n\n", numberArray [i]);
    }
    fclose (myFile);
    return 0;
}




#include<stdio.h>
#define MAX 16 
int main(){
	FILE *file;
	int i, arr[MAX];
	if (!(file=fopen("somenumbers.txt","r"))){
		printf("Error Reading File\n");
		return 1;
	}
	for(i=0; i<MAX; i++){
		if(fscanf(file,"%d,", &arr[i])!=1) break;
	}
	for(i=0; i<MAX; i++){
		printf("Number is: %d\n", arr[i]);
	}
	fclose(file);
	return 0;
}


