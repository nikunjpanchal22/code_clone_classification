protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    double norm = 1 / (1 + k / Q + k * k);
    A0 = k / Q * norm;
    A1 = 0;
    A2 = - A0;
    B1 = 2 * (k * k - 1) * norm;
    B2 = (1 - k / Q + k * k) * norm;
}


 protected override void CalculateBiQuadCoefficients() 
{ 
    double tang = Math.Tan(Math.PI * Frequency / SampleRate); 
    double normalization = 1f / (1f + tang / Q + tang * tang); 
    A0 = tang / Q * normalization; 
    A1 = 0f; 
    A2 = -A0; 
    B1 = 2f * (tang * tang - 1f) * normalization; 
    B2 = (1f - tang / Q + tang * tang) * normalization; 
}


