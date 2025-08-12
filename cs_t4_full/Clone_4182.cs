protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    double norm = 1 / (1 + k / Q + k * k);
    A0 = k / Q * norm;
    A1 = 0;
    A2 = - A0;
    B1 = 2 * (k * k - 1) * norm;
    B2 = (1 - k / Q + k * k) * norm;
}


 protected override void CalculateBiQuadCoefficients() {
    double tangent = Math.Tan(Math.PI * Frequency / SampleRate);
    double norm = 1f/(1f + tangent / Q + tangent * tangent);
    A0 = tangent / Q * norm; 
    A1 = 0f;
    A2 = -A0;
    B1 = (2f * (tangent * tangent - 1f)) * norm; 
    B2 = (1f - tangent / Q + tangent * tangent) * norm;
}


