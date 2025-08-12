static Type CreateEmailType () {
    var assemblyName = new AssemblyName ("DynamicAssembly");
    var assemblyBuilder = AppDomain.CurrentDomain.DefineDynamicAssembly (assemblyName, AssemblyBuilderAccess.Run);
    var moduleBuilder = assemblyBuilder.DefineDynamicModule (assemblyName.Name);
    var typeBuilder = moduleBuilder.DefineType ("Email", (TypeAttributes.Public | TypeAttributes.Sealed | TypeAttributes.SequentialLayout | TypeAttributes.Serializable), typeof (ValueType));
    typeBuilder.DefineField ("From", typeof (string), FieldAttributes.Public);
    typeBuilder.DefineField ("To", typeof (string), FieldAttributes.Public);
    typeBuilder.DefineField ("Subject", typeof (string), FieldAttributes.Public);
    typeBuilder.DefineField ("Body", typeof (string), FieldAttributes.Public);
    return typeBuilder.CreateType ();
}





public static Type GenerateEmailType(){
    var an = new AssemblyName("DynamicAssemblyEmail");
    var ab = AppDomain.CurrentDomain.DefineDynamicAssembly(an, AssemblyBuilderAccess.RunAndSave);
    var mb = ab.DefineDynamicModule(an.Name, an.Name + ".dll");
    var tb = mb.DefineType("Email", TypeAttributes.Public | TypeAttributes.AutoClass | TypeAttributes.BeforeFieldInit);
    tb.DefineField("Sender", typeof(string), FieldAttributes.Public);
    tb.DefineField("Recipient", typeof(string), FieldAttributes.Public);
    tb.DefineField("Subject", typeof(string), FieldAttributes.Public);
    tb.DefineField("Body", typeof(string), FieldAttributes.Public);
    return tb.CreateType();
}


