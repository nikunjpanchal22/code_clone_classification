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





public static Type CreateEmailType(){
    var asmName = new AssemblyName("DynamicEmailAssembly");
    var asmBuilder = AppDomain.CurrentDomain.DefineDynamicAssembly(asmName, AssemblyBuilderAccess.RunAndSave);
    var modBuilder = asmBuilder.DefineDynamicModule(asmName.Name, asmName.Name + ".dll");
    var emailTypeBuilder = modBuilder.DefineType("Email", TypeAttributes.Public | TypeAttributes.SequentialLayout | TypeAttributes.Serializable);
    emailTypeBuilder.DefineField("From", typeof(string), FieldAttributes.Public);
    emailTypeBuilder.DefineField("To", typeof(string), FieldAttributes.Public);
    emailTypeBuilder.DefineField("Subject", typeof(string), FieldAttributes.Public);
    emailTypeBuilder.DefineField("Content", typeof(string), FieldAttributes.Public);
    return emailTypeBuilder.CreateType();
}


