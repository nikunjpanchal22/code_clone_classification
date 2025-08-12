int main (int argc, char **argv) {
    bmp085_Calibration ();
    int count;
    for (count = 0; count < 49; ++count) {
        temperature = bmp085_GetTemperature (bmp085_ReadUT ());
        pressure = bmp085_GetPressure (bmp085_ReadUP ());
        altitude = bmp085_Altitude (pressure);
        printf ("Temperature\t%0.1f *F\n", ((double) temperature) / 10 * 1.8 + 32);
        printf ("Pressure\t%0.2f hPa\n", ((double) pressure) / 100);
        printf ("Altitude\t%0.1f Feet\n", ((double) altitude) * 3.280839895);
        sleep (1800);
    }
    return 0;
}


int main (int argc, char **argv) {
    bmp085_Calibration();
    int count;
    for (count = 0; count < 49; ++count) {
        int16_t temperature = bmp085_GetTemperature(bmp085_ReadUT());
        int32_t pressure = bmp085_GetPressure(bmp085_ReadUP());
        int32_t altitude = bmp085_Altitude(pressure);
        printf("Temperature\t%0.1f *F\n", ((double) temperature) / 10 * 1.8 + 32);
        printf("Pressure\t%0.2f hPa\n", ((double) pressure) / 100);
        printf("Altitude\t%0.1f Feet\n", ((double) altitude) * 3.280839895);
        sleep(1800);
    }
    return 0;
}
