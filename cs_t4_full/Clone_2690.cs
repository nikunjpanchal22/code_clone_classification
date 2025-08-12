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
    sout.WriteByte ((byte) (BitConverter.IsLittleEndian ? 1 : 0));
    WriteBytes(sout, GeoBase.PolygonWkbs);
    WriteBytes(sout, BitConverter.GetBytes (this.Rings.Count));
    this.Rings.ForEach(ring => {
        WriteBytes(sout, BitConverter.GetBytes (ring.Count));
        ring.ForEach(pos => pos.WellKnownBinary (sout));
    });
}


