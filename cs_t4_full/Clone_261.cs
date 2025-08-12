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
    double sine = Math.Sin (Math.PI * Frequency / SampleRate);
    double cosine = Math.Cos (Math.PI * Frequency / SampleRate);
    double denominator = 1 + sine/(Q*cosine) + sine*sine;
    A0 = sine/(Q*cosine)/denominator;
    A1 = 0;
    A2 = -A0;
    B1 = 2*(sine*sine - cosine*cosine) / denominator;
    B2 = (1 - sine/(Q*cosine) + sine*sine) / denominator;
}


