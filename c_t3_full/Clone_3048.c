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




int main()
        {
        float c, f;
        while(true)
        {
        printf("Enter temperature in Celsius (type 'stop to stop'): ");
        if(scanf(" %f", &c )!= 1) break;
        f = c * 1.8 + 32;
        printf("Temperature in Fahrenheit: %f\n", f);
        }
        return 0;
}


