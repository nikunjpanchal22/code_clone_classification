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


int main (void) {
    float temperature, celsius, fahrenheit;
    while (1) {
        printf ("Please input a temperature (type 'stop' to stop): ");
        if (scanf ("%f", &temperature) != 1)
            break;
        celsius = temperature;
        fahrenheit = (1.8 * celsius) + 32;
        printf ("Temperature in Fahrenheit: %f\n", fahrenheit);
    }
    return (0);
}
