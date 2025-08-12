public override void WellKnownBinary (Stream sout) {
    byte order = BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0;
    sout.WriteByte (order);
    sout.Write (GeoBase.MultiPointWkbs, 0, 4);
    sout.Write (BitConverter.GetBytes (this.Points.Count), 0, 4);
    foreach (var point in this.Points) {
        sout.WriteByte (order);
        sout.Write (GeoBase.PointWkbs, 0, 4);
        point.WellKnownBinary (sout);
    }
}


	public override void WellKnownBinary (Stream sout) {
    // Determine Ordering for bytes
    byte order = (BitConverter.IsLittleEndian) ? (byte) 1 : (byte) 0;

    // Write MultiPoint WKB
    sout.Write(GeoBase.MultiPointWkbs, 0, 4);
    // Write point count as array of bytes
    sout.Write(BitConverter.GetBytes(this.Points.Count), 0, 4);

    for (int i = 0; i < this.Points.Count; i++)
    {
        sout.WriteByte(order);
        sout.Write(GeoBase.PointWkbs, 0, 4);
        this.Points[i].WellKnownBinary(sout);
    }
}


