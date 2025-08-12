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
    double k = Math.Tan(Math.PI * Frequency / SampleRate); 
    var norm = 1 / (1 + (Math.Pow(k, 3) / Q)); 
    A0 = 1 * norm; 
    A1 = -2 * A0; 
    A2 = A0; 
    B1 = 2 * (1 - (Math.Pow(k, 3) / Q)) * norm; 
    B2 = (1 + k / Q + Math.Pow(k, 3)) * norm; 
}


