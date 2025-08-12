protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    var norm = 1 / (1 + k / Q + k * k);
    A0 = 1 * norm;
    A1 = - 2 * A0;
    A2 = A0;
    B1 = 2 * (k * k - 1) * norm;
    B2 = (1 - k / Q + k * k) * norm;
}



 

protected override void CalculateBiQuadCoefficients()
{
    double sinh = 1.0 / (2 * Q) * (Math.E - 1 / Math.E) / 2;
    double cosPi = Math.Cos(Math.PI * Frequency / SampleRate);
    double sinPi = Math.Sin(Math.PI * Frequency / SampleRate);
    double a = 1 + sinh * sinPi;
    double norm = 1 / a;

    A0 = norm;
    A1 = A0 * -2 * cosPi; 
    A2 = norm;
    B1 = 2 * cosPi * norm;
    B2 = (a - 2 * cosPi) * norm;
}


