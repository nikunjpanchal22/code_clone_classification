protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    var norm = 1 / (1 + k / Q + k * k);
    A0 = k * k * norm;
    A1 = 2 * A0;
    A2 = A0;
    B1 = 2 * (k * k - 1) * norm;
    B2 = (1 - k / Q + k * k) * norm;
}





protected override void CalculateBiQuadCoefficients() {
    Double angle_Freq = Math.PI * Frequency / SampleRate;
    Double t = Math.Atan(angle_Freq);
    Double t_squared = t * t;
    Double norm = 1 / (1 + t / Q + t_squared);

    A0 = t_squared * norm;
    A1 = 2.0 * A0;
    A2 = A0;
    B1 = 2.0 * (t_squared - 1.0) * norm;
    B2 = (1 - t / Q + t_squared) * norm;
}


