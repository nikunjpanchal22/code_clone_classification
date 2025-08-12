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
    sout.WriteByte (BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0);
    sout.Write (GeoBase.PolygonWkbs, 0, 4);
    sout.Write (BitConverter.GetBytes (this.Rings.Count), 0, 4);

    // Writing bytes using Buffer.BlockCopy
    foreach (var ring in this.Rings) {
        byte[] byteArrayIn = BitConverter.GetBytes (ring.Count);
        byte[] res = new byte[4];
        Buffer.BlockCopy(byteArrayIn, 0, res, 0, 4);
        sout.Write (res, 0, 4);
        
        foreach (var position in ring) {
            position.WellKnownBinary (sout);
        }  
    }
}


