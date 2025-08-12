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

    foreach (var ring in this.Rings) {
        // Writing bytes in Reverse order
        byte[] byteArrayIn = BitConverter.GetBytes (ring.Count);
        byte[] resReversed = new byte[4];
        for (int i = 0; i < byteArrayIn.Length; i++)
        {
            byte b = byteArrayIn[i];
            resReversed[3 - i] = b;
        }
        sout.Write (resReversed, 0, 4);
        foreach (var position in ring) {
            position.WellKnownBinary (sout);
        }  
    }
}


