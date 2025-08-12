int main (void) {
    int a [11] = {1, 2, 3, 4, 5, 11, 11, 11, 11, 16, 16};
    int a_size = sizeof (a) / sizeof (a[0]);
    print (a, a_size, "Before", "a");
    a_size = compact (a, a_size);
    print (a, a_size, "After", "a");
    int b [11] = {11, 1, 11, 3, 16, 2, 5, 11, 4, 11, 16};
    int b_size = sizeof (b) / sizeof (b[0]);
    print (b, b_size, "Before", "b");
    qsort (b, b_size, sizeof (b [0]), intcmp);
    print (b, b_size, "Sorted", "b");
    b_size = compact (b, b_size);
    print (b, b_size, "After", "b");
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
int intcmp (const void* p1, const void* p2) {
		  return (*(int*) p1 - *(int*) p2);
		}
		void print(char* str1, char* str2, int* arr, int size){
		    printf("%s %s: ", str1, str2);
		    for(int i=0; i<size; i++){
			printf("%d ", arr[i]);
		    }
		    printf("\n");
		}
		int compact(int* arr, int size){
		    int j, k;
		    for(int i=0; i<size; i++){
			for(j=i+1; j<size;){
			    if(arr[i] == arr[j]){
				for(k=j; k<size; k++){
				    arr[k] = arr[k+1];
				}
				size--;
			    }
			    else{
				j++;
			    }
			}
		    }
		    return size;
		}
		int main (void) {
		    int a [11] = {1, 2, 3, 4, 5, 11, 11, 11, 11, 16, 16};
		    int a_size = sizeof (a) / sizeof (a[0]);
		    print ("Before", "a", a, a_size);
		    a_size = compact (a, a_size);
		    print ("After", "a", a, a_size);
		    int b [11] = {11, 1, 11, 3, 16, 2, 5, 11, 4, 11, 16};
		    int b_size = sizeof (b) / sizeof (b[0]);
		    print ("Before", "b", b, b_size);
		    qsort (b, b_size, sizeof (b [0]), intcmp);
		    print ("Sorted", "b", b, b_size);
		    b_size = compact (b, b_size);
		    print ("After", "b", b, b_size);
		    return 0;
}


