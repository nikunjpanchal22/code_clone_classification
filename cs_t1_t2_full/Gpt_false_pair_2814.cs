protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    double norm = 1 / (1 + k / Q + k * k);
    A0 = (1 + k * k) * norm;
    A1 = 2 * (k * k - 1) * norm;
    A2 = A0;
    B1 = A1;
    B2 = (1 - k / Q + k * k) * norm;
}


protected override void CalculateBiQuadCoefficients() {
    double coefficient = Math.Tan(Math.PI * Frequency / SampleRate);
    double weightedAverage = 1 / (1 + coefficient / Q + coefficient * coefficient);
    A0 = (1 + coefficient * coefficient) * weightedAverage;
    A1 = 2 * (coefficient * coefficient - 1) * weightedAverage;
    A2 = A0;
    B1 = A1;
    B2 = (1 - coefficient / Q + coefficient * coefficient) * weightedAverage;
}
