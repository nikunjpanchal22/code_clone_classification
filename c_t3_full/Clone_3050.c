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
        float celsius, fahrenheit; 
        for(;;) 
        {
        printf ("Celsius (type 'stop' to stop): "); if (scanf ("%f", &celsius) != 1) break; 
        fahrenheit = celsius * 1.8 + 32; printf ("Fahrenheit: %1.2f\n", fahrenheit); 
        }
        return 0;
}


