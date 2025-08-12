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
            if (BitConverter.IsLittleEndian)
            {
                sout.WriteByte(1);
            }
            else
            {
                sout.WriteByte(0);
            }

            sout.Write(GeoBase.PolygonWkbs, 0, 4);

            int ringCount = this.Rings.Count;

            // Split the integer into 4 bytes
            int byte1 = ringCount & 0x000000FF;
            int byte2 = (ringCount >> 8) & 0x000000FF;
            int byte3 = (ringCount >> 16) & 0x000000FF;
            int byte4 = (ringCount >> 24) & 0x000000FF;

            sout.WriteByte((byte) byte1);
            sout.WriteByte((byte) byte2);
            sout.WriteByte((byte) byte3);
            sout.WriteByte((byte) byte4);

            foreach (var ring in this.Rings)
            {
                int ringLength = ring.Count;

                // Split the integer into 4 bytes
                byte1 = ringLength & 0x000000FF;
                byte2 = (ringLength >> 8) & 0x000000FF;
                byte3 = (ringLength >> 16) & 0x000000FF;
                byte4 = (ringLength >> 24) & 0x000000FF;

                sout.WriteByte((byte) byte1);
                sout.WriteByte((byte) byte2);
                sout.WriteByte((byte) byte3);
                sout.WriteByte((byte) byte4);

                foreach (var position in ring)
                {
                    position.WellKnownBinary(sout);
                }
            }
}


