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
    double tan_angle = Math.Tan(Math.PI * Frequency / SampleRate);
    double normalizer = 1f / (1f + tan_angle / Q + tan_angle * tan_angle);
    A0 = tan_angle / Q * normalizer;
    A1 = 0f;
    A2 = -A0;
    B1 = 2f * (tan_angle * tan_angle - 1f) * normalizer;
    B2 = (1f - tan_angle / Q + tan_angle * tan_angle) * normalizer;
}


