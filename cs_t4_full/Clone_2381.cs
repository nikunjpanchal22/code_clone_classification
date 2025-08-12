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
    var freq = 2 * Math.PI * Frequency / SampleRate;
    var alphaSQ = Math.Pow(Math.Sin(freq) / (2 * Q), 2);
    
    A0 = 1 / (1 + alphaSQ);
    A1 = -2 * Math.Cos(freq) * A0;
    A2 = A0;
    B1 = 2 * (Math.Cos(freq) - 1) * A0;
    B2 = (1 - alphaSQ) * A0;
}


