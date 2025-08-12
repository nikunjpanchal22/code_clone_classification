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
    double omega = 2 * Math.PI * Frequency / SampleRate;
    double sinOmega = Math.Sin(omega);
    double alpha = sinOmega / (2 * Q);

    var norm = 1 / (1 + alpha);

    A0 = norm ;
    A1 = -2 * Math.Cos(omega) * norm;
    A2 = norm;
    B1 = 2 * (Math.Cos(omega) - 1) * norm;
    B2 = (1 - alpha) * norm;
}


