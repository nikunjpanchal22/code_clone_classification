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
public static SqlBytes Shrink(SqlBytes input)
{
    if (input.IsNull)
        return SqlBytes.Null;
    using (var output = new MemoryStream())
    {
        using (var deflate = new DeflateStream(output, CompressionMode.Compress, true))
        {
            deflate.Write(input.Buffer, 0, input.Buffer.Length);
            deflate.Close();
        }
        return new SqlBytes(output.ToArray());
    }
}


