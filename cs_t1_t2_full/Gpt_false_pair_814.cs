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
        byte endianness = BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0;
        sout.WriteByte(endianness);
        sout.Write(GeoBase.MultiPointWkbs, 0, 4);
        sout.Write(BitConverter.GetBytes(this.Points.Count), 0, 4);
        foreach (var point in this.Points) {
            sout.WriteByte(endianness);
            sout.Write(GeoBase.PointWkbs);
            point.WellKnownBinary (sout);
        }
}
