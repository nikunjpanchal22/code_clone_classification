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
    double frequencyDouble = (double)Frequency;
    double sampleRateDouble = (double)SampleRate;
    double k = Math.Tan (Math.PI * frequencyDouble / sampleRateDouble);
    double normFactor = 1 / (1 + k / Q + k * k);
    A0 = k / Q * normFactor;
    A1 = 0;
    A2 = -A0;
    B1 = (2 * (k * k - 1)) * normFactor;
    B2 = (1 - k / Q + (k * k)) * normFactor;
}


