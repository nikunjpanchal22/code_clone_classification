protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    double norm = 1 / (1 + k / Q + k * k);
    A0 = k / Q * norm;
    A1 = 0;
    A2 = - A0;
    B1 = 2 * (k * k - 1) * norm;
    B2 = (1 - k / Q + k * k) * norm;
}


protected override void CalculateBiQuadCoefficients() {
    double k = System.Math.Tan(System.Math.PI * Frequency / SampleRate);
    double invNorm = 1 / (1 + k / Q + k * k);
    A0 = k / Q * invNorm;
    A1 = 0;
    A2 = -A0;
    B1 = 2 * (k * k - 1) * invNorm;
    B2 = (1 - k / Q + k * k) * invNorm;
}
