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
    byte endianByte = BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0;
    sout.WriteByte (endianByte);
    sout.Write (GeoBase.PolygonWkbs, 0, GeoBase.PolygonWkbs.Length);
    WriteCountToStream(sout, this.Rings.Count);
    this.Rings.ForEach(ring => {
        WriteCountToStream(sout, ring.Count);
        ring.ForEach(pos => pos.WellKnownBinary (sout));
    });
}



