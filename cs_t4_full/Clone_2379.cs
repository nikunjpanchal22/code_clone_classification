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
    var x = 2 * Math.PI * Frequency / SampleRate;
    var cosx = Math.Cos(x);
    var sinDivQ = Math.Sin(x) / (2 * Q);

    A0 = 1 / (1 + sinDivQ);
    A1 = -2 * cosx * A0;
    A2 = A0;
    B1 = 2 * (cosx - 1) * A0;
    B2 = (1 - sinDivQ) * A0;
}


