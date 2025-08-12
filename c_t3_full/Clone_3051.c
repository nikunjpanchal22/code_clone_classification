int main (void) {
    float celsius, fahrenheit;
    while (1) {
        printf ("Please input a temperature in Celsius (type 'stop' to stop): ");
        if (scanf ("%f", &celsius) != 1)
            break;
        fahrenheit = (1.8 * celsius) + 32;
        printf ("Temperature in Fahrenheit: %f\n", fahrenheit);
    }
    return (0);
}




#include<stdio.h>
int main()
        {
        float c, f;
        for(;;)
        {
        printf("Please input a temperature in Celsius (type 'stop' to stop): ");
        if(scanf("%f",&c)!=1) break;
        f = 1.8 * c + 32.0; printf("Temperature in Fahrenheit is: %f\n", f);
        }
}


