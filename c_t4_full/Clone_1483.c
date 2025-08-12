int main (int argc, char *argv []) {
    int src [argc], dest [argc];
    int cur, max = 0, n = argc - 1;
    for (int i = 0; i < n; i++) {
        src[i] = cur = atoi (argv[i + 1]);
        if (max < cur)
            max = cur;
    }
    if (max < 9) {
        encode9 (dest, src, n);
    }
    else {
        encode64 (dest, src, n);
    }
    for (int i = 0; i < n; i++) {
        printf ("%d ", dest [i]);
    }
    printf ("\n");
    return 0;
}




#include <stdio.h>
#include <stdlib.h>

void setData(int* src, int* dest, char* argv[], int n, int* max) {
		    for (int i = 0; i < n; ++i) {
			int cur = atoi(argv[i + 1]);
			src[i] = cur;
			if(*max < cur) *max = cur;
		    }
		}
		void printData(int* dest, int n) {
		    for (int i = 0; i < n; ++i) printf("%d ", dest[i]);
		    printf("\n");
		}
		int main (int argc, char *argv []) {
		    int src [argc], dest [argc];
		    int max = 0, n = argc - 1;
		    setData(src, dest, argv, n, &max);
		    if (max < 9) encode9 (dest, src, n);
		    else encode64 (dest, src, n);
		    printData(dest, n);
		    return 0;
}


