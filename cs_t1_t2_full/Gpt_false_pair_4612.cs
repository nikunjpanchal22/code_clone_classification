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
    double w = Math.PI * Frequency / SampleRate;
    var norm = 1 / (1 + w / Q + w * w);
    A0 = 1 * norm;
    A1 = - 2 * A0;
    A2 = A0;
    B1 = 2 * (w * w - 1) * norm;
    B2 = (1 - w / Q + w * w) * norm;
}
