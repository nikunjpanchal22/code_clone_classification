protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    var norm = 1 / (1 + k / Q + k * k);
    A0 = 1 * norm;
    A1 = - 2 * A0;
    A2 = A0;
    B1 = 2 * (k * k - 1) * norm;
    B2 = (1 - k / Q + k * k) * norm;
}



 

protected override void CalculateBiQuadCoefficients()
{
    double sinOmega = Math.Sin(Math.PI * Frequency / SampleRate);
    double cosOmega = Math.Cos(Math.PI * Frequency / SampleRate);
    var norm = 1 / (1 + sinOmega / Q + sinOmega * sinOmega);

    A0 = 1 * norm;
    A1 = -2 * cosOmega * A0;
    A2 = A0;
    B1 = 2 * (sinOmega * sinOmega - cosOmega * cosOmega) * norm;
    B2 = (1 - sinOmega / Q + sinOmega * sinOmega) * norm;
}


