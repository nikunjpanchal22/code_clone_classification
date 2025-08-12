protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    var norm = 1 / (1 + k / Q + k * k);
    A0 = k * k * norm;
    A1 = 2 * A0;
    A2 = A0;
    B1 = 2 * (k * k - 1) * norm;
    B2 = (1 - k / Q + k * k) * norm;
}


 protected override void CalculateBiQuadCoefficients() 
    { 
        double k = Math.Tan(Math.PI * Frequency / SampleRate); 
        double norm = 1.0 / (1.0 + (k / Q) + Math.Pow(k, 2)); 
        A0 = (Math.Pow(k, 2) * norm); 
        A1 = (2 * A0); 
        A2 = (A0); 
        B1 = (-2 * (Math.Pow(k, 2) - 1.0) * norm); 
        B2 = (1.0 - (k / Q) + Math.Pow(k, 2)) * norm; 
}


