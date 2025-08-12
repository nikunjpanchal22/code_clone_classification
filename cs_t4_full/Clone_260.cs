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
    double fqVal = Math.Tan (Math.PI * Frequency / SampleRate);
    double inverseVal = 1 / (1 + (fqVal/Q) + Math.Pow(fqVal, 2));
    A0 = (fqVal/Q) * inverseVal;
    A1 = 0;
    A2 = -A0;
    B1 = (2 * (Math.Pow(fqVal, 2) - 1)) * inverseVal;
    B2 = (1 - (fqVal/Q) + Math.Pow(fqVal, 2)) * inverseVal;
}


