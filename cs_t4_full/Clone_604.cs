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
                if (BitConverter.IsLittleEndian == true) { 
                    sout.WriteByte(0x00000001);
                } else {
                    sout.WriteByte(0x00);
                }
                sout.Write (GeoBase.PolygonWkbs, 0, 4);
                int ringCount = this.Rings.Count;
                int ringLength = 0;

                foreach (var ring in this.Rings) {
                    ringLength = ring.Count;
                }

                int[] binaryStyleRingCount = new int[4] { ringCount >> 24, (ringCount & 0x00FF0000) >> 16, (ringCount & 0x0000FF00) >> 8, ringCount & 0x000000FF };
                int[] binaryStyleRingLength = new int[4] { ringLength >> 24, (ringLength & 0x00FF0000) >> 16, (ringLength & 0x0000FF00) >> 8, ringLength & 0x000000FF };
                sout.Write (BitConverter.GetBytes (binaryStyleRingCount), 0, 4);

                foreach (var ring in this.Rings) {
                    sout.Write (BitConverter.GetBytes (binaryStyleRingLength), 0, 4);
                    foreach (var position in ring) {
                        position.WellKnownBinary (sout);
                    }
                } 

}


