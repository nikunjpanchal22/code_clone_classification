protected override void CalculateBiQuadCoefficients () {
    double k = Math.Tan (Math.PI * Frequency / SampleRate);
    double norm = 1 / (1 + k / Q + k * k);
    A0 = (1 + k * k) * norm;
    A1 = 2 * (k * k - 1) * norm;
    A2 = A0;
    B1 = A1;
    B2 = (1 - k / Q + k * k) * norm;
}





protected override void CalculateBiQuadCoefficients() {
    double k = Math.Tan(Math.PI * (this.Frequency / this.SampleRate));
    double norm = 1 / (1 + k / this.Q + k * k);
    this.A0 = (1 + k * k) * norm;
    this.A1 = 2 * (k * k - 1) * norm;
    this.A2 = this.A0;
    this.B1 = this.A1;
    this.B2 = (1 - k / this.Q + k * k) * norm;
}


