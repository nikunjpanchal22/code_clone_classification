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


 public override void WellKnownBinary (Stream sout){ 
                int value;
                if (BitConverter.IsLittleEndian == true) {
                    value = 0x01;
                } else {
                    value = 0x00;
                }
                byte[] byteValue = BitConverter.GetBytes(value);
                sout.Write(byteValue, 0, 1);

                byte[] polygonWkbs = GeoBase.PolygonWkbs;
                sout.Write(polygonWkbs, 0, 4);

                int ringCount = this.Rings.Count;
                byte[] ringCountInBytes = BitConverter.GetBytes(ringCount);
                sout.Write(ringCountInBytes, 0, 4);

                int ringLength;
                foreach (var ring in this.Rings) {
                    ringLength = ring.Count;
                    byte[] ringLengthInBytes = BitConverter.GetBytes(ringLength);
                    sout.Write(ringLengthInBytes, 0, 4);
                    foreach (var position in ring) {
                        position.WellKnownBinary(sout);
                    }  
                }
}


