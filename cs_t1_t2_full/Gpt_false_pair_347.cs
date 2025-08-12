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


 [Microsoft.SqlServer.Server.SqlFunction (IsDeterministic = true, IsPrecise = true, DataAccess = DataAccessKind.None)]
public static SqlBytes BinaryCompress (SqlBytes input)
{
    if (input.IsNull)
        return SqlBytes.Null;
    using (MemoryStream result = new MemoryStream ())
    {
        using (FPCompressorStream fpCompressorStream = new FPCompressorStream (result, CompressionMode.Compress, true))
        {
            fpCompressorStream.Write (input.Buffer, 0, input.Buffer.Length);
            fpCompressorStream.Flush ();
            fpCompressorStream.Close ();
        }
        return new SqlBytes (result.ToArray ());
    }
}
