protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    double norm = 1 / (1 + k / Q + k * k);
    A0 = k / Q * norm;
    A1 = 0;
    A2 = - A0;
    B1 = 2 * (k * k - 1) * norm;
    B2 = (1 - k / Q + k * k) * norm;
}


 protected override void CalculateBiQuadCoefficients () {
    double tParam = Math.Tan (Math.PI * Frequency / SampleRate);
    double denormVal = 1 + tParam / Q + (tParam*tParam);
    double normFactor = 1 / denormVal;
    A0 = (tParam/Q) * normFactor;
    A1 = 0;
    A2 = -A0;
    B1 = (2 * (tParam*tParam - 1)) * normFactor;
    B2 = ((1 - tParam/Q) + tParam*tParam) * normFactor;
}


