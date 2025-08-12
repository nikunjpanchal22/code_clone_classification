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

    // Writing bytes using BitArray
    foreach (var ring in this.Rings) {
        byte[] byteArrayIn = BitConverter.GetBytes (ring.Count);
        byte[] res = new byte[4];
        for (int i = 0; i < byteArrayIn.Length; i++)
        {
            BitArray ba = new BitArray(new byte[] { byteArrayIn[i] });
            for (int j = 0; j < 8; j++)
            {
                res[i * 8 + j] = ba[j] ? (byte)1 : (byte)0;
            }
        }
        sout.Write (res, 0, 4);

        foreach (var position in ring) {
            position.WellKnownBinary (sout);
        }  
    }
}


