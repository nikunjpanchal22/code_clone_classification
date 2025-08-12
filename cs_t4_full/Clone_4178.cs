protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    var norm = 1 / (1 + k / Q + k * k);
    A0 = k * k * norm;
    A1 = 2 * A0;
    A2 = A0;
    B1 = 2 * (k * k - 1) * norm;
    B2 = (1 - k / Q + k * k) * norm;
}


	protected override void CalculateBiQuadCoefficients () {
    double dw = 2 * Math.PI * Frequency / SampleRate;
    var norm = 1 / (1 + Math.Tan(dw) / Q + Math.Pow(Math.Tan(dw), 2));
    A0 = Math.Pow(Math.Tan(dw), 2) * norm;
    A1 = 2 * A0;
    A2 = A0;
    B1 = 2 * (Math.Pow(Math.Tan(dw), 2) - 1) * norm;
    B2 = (1 - Math.Tan(dw) / Q + Math.Pow(Math.Tan(dw), 2)) * norm;
}


