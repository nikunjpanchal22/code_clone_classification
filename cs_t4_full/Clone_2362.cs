protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    var norm = 1 / (1 + k / Q + k * k);
    A0 = k * k * norm;
    A1 = 2 * A0;
    A2 = A0;
    B1 = 2 * (k * k - 1) * norm;
    B2 = (1 - k / Q + k * k) * norm;
}



protected override void CalculateBiQuadCoefficients() {
    double s = Math.Sin (2 * Math.PI * Frequency / SampleRate);
    double c = 1 / Q;
    A0 = s * s / (2 * c);
    A1 = 2 * A0;
    A2 = A0;
    B1 = 2 * (s * s - c);
    B2 = (c - s / Q + s * s) / (2 * c);
}


