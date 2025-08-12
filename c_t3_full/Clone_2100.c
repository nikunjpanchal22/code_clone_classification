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
float compare(float a, float b) {
	    if (a > b) 
		return a;
	    else
		return b;
	}
	int main() {
	    float m, n, p, max;
	    if (scanf ("%f%f%f", &m, &n, &p) != 3) {
		puts ("Bad input");
		return 1;
	    }
	    max = compare(m, compare(n, p));
	    printf("%f", max);
	    return 0;
}


