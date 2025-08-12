protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    var norm = 1 / (1 + k / Q + k * k);
    A0 = 1 * norm;
    A1 = - 2 * A0;
    A2 = A0;
    B1 = 2 * (k * k - 1) * norm;
    B2 = (1 - k / Q + k * k) * norm;
}


  protected override void CalculateBiQuadCoefficients () {
    double factor = Math.PI * Frequency / SampleRate;
    double k = Math.Tan ( factor );
    double normDivisor = 1.0 / (1.0 + k / Q + k * k);
    A0 = normDivisor;
    A1 = -2.0 * A0;
    A2 = A0;
    B1 = 2.0 * (k * k - 1.0) * normDivisor;
    B2 = (1.0 - k / Q + k * k) * normDivisor;
}


