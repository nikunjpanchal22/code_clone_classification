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
    double Z = (Math.PI * Frequency) / SampleRate;
    double T = Math.Tan(Z);
    double Tk = T / Q;
    double norm = 1.0 / (1.0  + Tk + (T * T));
    A0 = (T * T) * norm ;
    A1 = 2 * A0 ;
    A2 = A0 ;
    B1 = 2.0 * ((T * T) - 1) * norm ;
    B2 = (1 - Tk + (T * T)) * norm ;
}


