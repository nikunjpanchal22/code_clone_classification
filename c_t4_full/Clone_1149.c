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
typedef union{
	    float f;
	    int i;
	} u;
	int main () {
	    u m, n, p;
	    float max;
	    if (scanf ("%f%f%f", &m.f, &n.f, &p.f) != 3) {
		puts ("Bad input");
		return 1;
	    }
	    max = m.f;
	    if (n.f > max) {
		__asm__(
		    "movss %1, %%xmm1; movss %2, %%xmm0; comiss %%xmm1, %%xmm0; jnae 1f; movss %%xmm0, %0; 1:"
		    : "=m"(max)
		    : "m"(max), "m"(n.f)
		);
	    }
	    if (p.f > max) {
		__asm__(
		    "movss %1, %%xmm1; movss %2, %%xmm0; comiss %%xmm1, %%xmm0; jnae 1f; movss %%xmm0, %0; 1:"
		    : "=m"(max)
		    : "m"(max), "m"(p.f)
		);
	    }
	    printf ("%f", max);
	    return 0;
}


