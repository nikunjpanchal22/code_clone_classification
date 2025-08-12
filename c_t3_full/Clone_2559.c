int main () {
    int n, a [4], final;
    scanf ("%d", & n);
    for (int i = 3; i >= 0; i--) {
        a[i] = n % 10 + 2;
        n /= 10;
    }
    final = (a[0] * 1000) + (a[1] * 100) + (a[2] * 10) + a[3];
    printf ("%d", final);
    return 0;
}




#include<stdio.h>

int main(){
	 int n,f=3,a[4],final;
	 scanf("%d",&n);
	 while(n>0)
	 {
	   a[f--]=n % 10 + 2;
	   n/=10;
	 }
	 final=(a[0]*1000)+(a[1]*100)+(a[2]*10)+a[3];
	 printf("%d",final);
	 return 0;
}


