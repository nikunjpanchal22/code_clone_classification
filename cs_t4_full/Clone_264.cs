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
    double ratio = Math.Tan (Math.PI * Frequency / SampleRate);
    double constant = 1 + ratio/Q + Math.Pow(ratio, 2);
    A0 = ratio/Q / constant;
    A1 = 0;
    A2 = -A0;
    B1 = 2*(Math.Pow(ratio, 2) - 1) / constant;
    B2 = (1 - ratio/Q + Math.Pow(ratio, 2)) / constant;
}


