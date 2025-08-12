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
    double cotangent = 1 / Math.Tan (Math.PI * Frequency / SampleRate);
    double divisor = 1 + cotangent/Q + cotangent*cotangent;
    A0 = cotangent / Q / divisor;
    A1 = 0;
    A2 = -A0;
    B1 = 2*(cotangent*cotangent - 1) / divisor;
    B2 = (1 - cotangent/Q + cotangent*cotangent) / divisor;
}


