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



[SqlServer.Server.SqlFunction(IsDeterministic = true, IsPrecise = true)]
public static SqlBytes Squeeze(SqlBytes input)
{
    if (input.IsNull)
        return SqlBytes.Null;
    using (var result = new MemoryStream())
    {
        using (var compressor = new DeflateStream(result, CompressionMode.Compress, true))
        {
            compressor.Write(input.Buffer, 0, input.Buffer.Length);
            compressor.Flush();
            compressor.Close();
        }
        return new SqlBytes(result.ToArray());
    }
}


