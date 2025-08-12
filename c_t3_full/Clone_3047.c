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




#include <stdio.h>
int main ()
        {
        float a1, a2;
        for(;;)
        {
        printf("Please enter Temp in Celsius : ");
        if(scanf("%f", &a1) != 1)
        break;
        a2=1.8*a1+32;
        printf("Temp in Fahrenheit is : %f\n", a2);
        }
        return 0;
}


