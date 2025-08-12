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
int main () {
    float nums[3], max;
    if (scanf ("%f%f%f", &nums[0], &nums[1], &nums[2]) != 3) {
        puts ("Bad input");
        return 1;
    }
    max = nums[0];
    for (int i=1; i<3; i++) {
        if (nums[i] > max) {
            max = nums[i];
        }
    }
    printf ("%f", max);
    return 0;
}


