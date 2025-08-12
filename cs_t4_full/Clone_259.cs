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
    double tanX = Math.Tan (Math.PI * Frequency / SampleRate);
    double inv = 1 / (1 + tanX / Q + Math.Pow(tanX, 2));
    A0 = (tanX / Q) * inv;
    A1 = 0;
    A2 = -A0;
    B1 = (2 * (Math.Pow(tanX, 2) - 1)) * inv;
    B2 = (1 - tanX / Q + Math.Pow(tanX, 2)) * inv;
}


