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
    double k = Math.Tan (Math.PI * 2 * Frequency / (SampleRate * 2));
    var norm = 1 + k / Q + k * k;
    A0 = norm;
    A1 = - norm * 2;
    A2 = norm;
    B1 = 2 * (1 - k * k) / norm;
    B2 = (1 + k / Q - k * k) / norm;
}


