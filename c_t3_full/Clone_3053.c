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



int main (void) {float c, f; for(;;){printf("Enter Celsius: ");if(scanf(" %f",&c)!= 1)break;printf("Fahrenheit: %f\n",(9.0/5.0)*c+32);}
}


