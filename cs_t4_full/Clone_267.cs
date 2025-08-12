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
    double taxent = Math.Tan (Math.PI * Frequency / SampleRate);
    double div = 1 + (taxent/Q) + Math.Pow(taxent, 2);
    A0 = (taxent/Q) / div;
    A1 = 0;
    A2 = -A0;
    B1 = (2*(Math.Pow(taxent, 2) - 1)) / div;
    B2 = (1 - (taxent/Q) + Math.Pow(taxent, 2)) / div;
}


