[Microsoft.SqlServer.Server.SqlFunction (IsDeterministic = true, IsPrecise = true, DataAccess = DataAccessKind.None)] public static SqlBytes BinaryCompress (SqlBytes input) {
    if (input.IsNull)
        return SqlBytes.Null;
    using (MemoryStream result = new MemoryStream ())
    {
        using (DeflateStream deflateStream = new DeflateStream (result, CompressionMode.Compress, true))
        {
            deflateStream.Write (input.Buffer, 0, input.Buffer.Length);
            deflateStream.Flush ();
            deflateStream.Close ();
        } return new SqlBytes (result.ToArray ());
    }}



[SqlFunction(IsDeterministic = true, IsPrecise = true, DataAccess=DataAccessKind.None)]
public static SqlBytes DataCompressor(SqlBytes input)
{
   if (input.IsNull) return SqlBytes.Null;
   using (var stream = new MemoryStream())
   {
       using (var zipStream = new DeflateStream(stream, CompressionMode.Compress,true))
       {
           zipStream.Write(input.Buffer, 0, input.Buffer.Length);
           zipStream.Flush();
           zipStream.Close();
       }
       return new SqlBytes(stream.ToArray());
   }
}


