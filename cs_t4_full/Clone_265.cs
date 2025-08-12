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
    double kata = Math.Tan (Math.PI * Frequency / SampleRate);
    double factorized = 1 + (kata/Q) + Math.Pow(kata, 2);
    A0 = (kata/Q) / factorized;
    A1 = 0;
    A2 = -A0;
    B1 = (2*(Math.Pow(kata, 2) - 1)) / factorized;
    B2 = (1 - (kata/Q) + Math.Pow(kata, 2)) / factorized;
}


