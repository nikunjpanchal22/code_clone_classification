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
    double tanFq = Math.Tan (Math.PI * Frequency / SampleRate);
    double denom = (1 + tanFq / Q + tanFq * tanFq);
    double normalization = 1 / denom;
    A0 = (tanFq / Q) * normalization;
    A1 = 0;
    A2 = - A0;
    B1 = (2 * (tanFq * tanFq - 1)) * normalization;
    B2 = (1 - tanFq / Q + tanFq * tanFq) * normalization;
}


