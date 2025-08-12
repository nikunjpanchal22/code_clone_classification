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
    byte endianOrder = BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0;
    sout.WriteByte (endianOrder);
    sout.Write (GeoBase.PolygonWkbs, 0, GeoBase.PolygonWkbs.Length);
    WriteIntToStream(sout, this.Rings.Count);
    foreach (var ring in this.Rings) {
        WriteIntToStream(sout, ring.Count);
        foreach (var pos in ring) {
            pos.WellKnownBinary (sout);
        }
    }
}


