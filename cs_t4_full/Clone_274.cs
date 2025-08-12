protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    double norm = 1 / (1 + k / Q + k * k);
    A0 = (1 + k * k) * norm;
    A1 = 2 * (k * k - 1) * norm;
    A2 = A0;
    B1 = A1;
    B2 = (1 - k / Q + k * k) * norm;
}


 protected override void CalculateBiQuadCoefficients() 
{
	double k = Math.Tan(Math.PI * Frequency / SampleRate); 
	double div = 1 / (1 + k/Q + (k * k)); 
	A0 = div * (1 + (k * k)); 
	A1 = div * (2 * (k * k - 1)); 
	A2 = A0; 
	B1 = A1; 
	B2 = div * (1 - k/Q + (k * k)); 
}


