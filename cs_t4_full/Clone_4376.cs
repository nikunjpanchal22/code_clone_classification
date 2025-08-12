public override void WellKnownBinary (Stream sout) {
    sout.WriteByte (BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0);
    sout.Write (GeoBase.PolygonWkbs, 0, 4);
    sout.Write (BitConverter.GetBytes (this.Rings.Count), 0, 4);
    foreach (var ring in this.Rings) {
        sout.Write (BitConverter.GetBytes (ring.Count), 0, 4);
        foreach (var position in ring) {
            position.WellKnownBinary (sout);
        }
    }
}


 public override void WellKnownBinary (Stream sout) {
    byte [] endianness = BitConverter.IsLittleEndian ? new byte [] {1} : new byte [] { 0};
    sout.Write (endianness, 0, endianness.Length); 
    sout.Write (GeoBase.PolygonWkbs, 0, 4);
    byte[] ringsCountBytes = BitConverter.GetBytes (this.Rings.Count); 
    sout.Write (ringsCountBytes, 0, ringsCountBytes.Length);
    foreach (var ring in this.Rings) {
        byte[] positionCountBytes = BitConverter.GetBytes (ring.Count);
        sout.Write (positionCountBytes, 0, positionCountBytes.Length);
        foreach (var position in ring) {
            position.WellKnownBinary (sout);
        }
    }
}


