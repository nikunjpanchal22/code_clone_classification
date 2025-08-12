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
    double kk = Math.Tan (Math.PI * Frequency / SampleRate);
    double denom = 1 + kk / Q + kk * kk;
    A0 = kk * kk / Q / denom;
    A1 = 0;
    A2 = - A0;
    B1 = 2 * (kk * kk - 1) / denom;
    B2 = (1 - kk / Q + kk * kk) / denom;
}


