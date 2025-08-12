int main () {
    FILE *f;
    char c;
    f = fopen ("test.txt", "rt");
    while ((c = fgetc (f)) != EOF) {
        printf ("%c", c);
    }
    fclose (f);
    return 0;
}





#include <stdio.h>
int main(){
    FILE *f = fopen("test.txt","r");
    char arr[1000] = "";
    while(fgets(arr,sizeof(arr),f) != NULL){
       printf("%s",arr);
    }
    fclose(f);
    return 0;
}


