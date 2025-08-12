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
    byte byteVal = BitConverter.IsLittleEndian ? (byte) 1 : (byte) 0;
    sout.WriteByte(byteVal);
    sout.Write (GeoBase.PolygonWkbs, 0, 4);
  
    //Write the Length
    sout.Write (BitConverter.GetBytes (this.Rings.Count), 0, 4);
    
    //Write position values
    foreach (var ring in this.Rings){
        var ringWriter = new BinaryWriter(sout);
        ringWriter.Write(ring.Count);

        foreach(var position in ring){
            var posBuffer = new MemoryStream();
            var bufferWriter  = new BinaryWriter(posBuffer);
            bufferWriter.Write(position.X);
            bufferWriter.Write(position.Y);
            bufferWriter.Write(position.Z); 
            // Write only required bytes
            sout.Write(posBuffer.GetBuffer(), 0, 8);
            posBuffer.Close();
            bufferWriter.Close();
        }
    }
}


