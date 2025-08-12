static void investigate (ParameterizedType p, Type...typeArgs) {
    final Class < ? > c = (Class < ? >) p.getRawType ();
    final StringBuilder b = new StringBuilder (c.getName ());
    b.append ('<');
    Type [] localArgs = p.getActualTypeArguments ();
    if (typeArgs != null && typeArgs.length > 0) {
        int i = 0, nextTypeArg = 0;
        for (Type local : localArgs) {
            if (local instanceof ParameterizedType) {
                ParameterizedType localP = (ParameterizedType) local;
                b.append (localP.getRawType ()).append ('<');
                b.append (typeArgs [nextTypeArg ++]);
                b.append ('>');
            } else if (local instanceof TypeVariable) {
                localArgs [nextTypeArg] = typeArgs [nextTypeArg];
                b.append (localArgs [nextTypeArg]);
                nextTypeArg ++;
            } else {
                b.append (local.toString ());
            }
            b.append (", ");
            i ++;
        }
        if (typeArgs.length > 0) {
            b.delete (b.length () - 2, b.length ());
        }
        b.append ('>');
    } else {
        String args = Arrays.toString (localArgs);
        b.append (args.substring (1, args.length () - 1)).append ('>');
    }
    System.out.println (b);
    investigate (c, localArgs);
}


static void investigate (ParameterizedType p, Type...typeArgs) {
    final Class < ? > c = (Class < ? >) p.getRawType ();
    final StringBuilder b = new StringBuilder (c.getName ());
    b.append ('<');
    Type [] localArgs = p.getActualTypeArguments ();
    if (typeArgs != null && typeArgs.length > 0) {
        int i = 0, nextTypeArg = 0;
        for (Type local : localArgs) {
            if (local instanceof ParameterizedType) {
                ParameterizedType localP = (ParameterizedType) local;
                b.append (localP.getRawType ()).append ('<');
                b.append (typeArgs [nextTypeArg ++]);
                b.append ('>');
            } else if (local instanceof TypeVariable) {
                localArgs [nextTypeArg] = typeArgs [nextTypeArg];
                b.append (localArgs [nextTypeArg]);
                nextTypeArg ++;
            } else {
                b.append (local.getTypeName ());
            }
            b.append (", ");
            i ++;
        }
        if (typeArgs.length > 0) {
            b.delete (b.length () - 2, b.length ());
        }
        b.append ('>');
    } else {
        List <String>argList = Arrays.stream (localArgs).map (a->a.toString ()).collect (Collectors.toList ());
        b.append (String.join (",", argList)).append ('>');
    }
    System.out.println (b);
    investigate (c, localArgs);
}
