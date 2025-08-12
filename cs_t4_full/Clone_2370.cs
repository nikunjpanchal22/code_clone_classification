protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    var norm = 1 / (1 + k / Q + k * k);
    A0 = 1 * norm;
    A1 = - 2 * A0;
    A2 = A0;
    B1 = 2 * (k * k - 1) * norm;
    B2 = (1 - k / Q + k * k) * norm;
}





protected override void CalculateBiQuadCoefficients () {
    double Omega = 2 * Math.PI * Frequency / SampleRate;
    double sinHalfOmega = Math.Sin(Omega / 2);
    double cosHalfOmega = Math.Cos(Omega / 2);
    var norm = 1 / (1 + sinHalfOmega / Q + sinHalfOmega * sinHalfOmega);
    A0 =  1 * norm;
    A1 = - 2 * cosHalfOmega * norm;
    A2 =  1 * norm;
    B1 = - 2 * cosHalfOmega * norm;
    B2 =  (1 - sinHalfOmega / Q + sinHalfOmega * sinHalfOmega) * norm;
}


