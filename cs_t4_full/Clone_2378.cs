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
    var w = 2 * Math.PI * Frequency / SampleRate;
    var cosw = Math.Cos(w);
    var sinw = Math.Sin(w);
    var alpha = sinw / (2 * Q);
    
    A0 = 1 / (1 + alpha);
    A1 = -2 * cosw * A0;
    A2 = A0;
    B1 = 2 * (cosw - 1) * A0;
    B2 = (1 - alpha) * A0;
}


