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
    double tanValue = Math.PI * Frequency / SampleRate;
    double k = Math.Tan ( tanValue );
    double dividend = 1 + k / Q + k * k;
    A0 = 1 / dividend;
    A1 = -2 * A0;
    A2 = A0;
    B1 = 2 * (Math.Pow(k,2)-1) * (1/dividend);
    B2 = (1 - k / Q + Math.Pow(k,2)) * (1/dividend);
}


