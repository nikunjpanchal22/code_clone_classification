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
    double theta = Math.Tan (Math.PI * Frequency / SampleRate);
    double coeff = 1 + theta/Q + Math.Pow(theta, 2);
    A0 = theta/Q / coeff;
    A1 = 0;
    A2 = -A0;
    B1 = (2*(Math.Pow(theta, 2) - 1)) / coeff;
    B2 = (1 - theta/Q + Math.Pow(theta, 2)) / coeff;
}


