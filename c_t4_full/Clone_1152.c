int main () {
    float m, n, p, max;
    if (scanf ("%f%f%f", &m, &n, &p) != 3) {
        puts ("Bad input");
        return 1;
    }
    max = m;
    if (n > max) {
        max = n;
    }
    if (p > max) {
        max = p;
    }
    printf ("%f", max);
    return 0;
}





#include <stdio.h>
float findMax(float arr[], int index, float max) {
	    if(index >= 3)
		return max;
	    if(arr[index] > max)
		max = arr[index];
	    return findMax(arr, index+1, max);
	}
	int main() {
	    float nums[3], max;
	    if (scanf ("%f%f%f", &nums[0], &nums[1], &nums[2]) != 3) {
		puts ("Bad input");
		return 1;
	    }
	    max = findMax(nums, 0, nums[0]);
	    printf("%f", max);
	    return 0;
}


