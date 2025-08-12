int main (int argc, char *argv []) {
    char *localArgs [] = {"R", "--no-save", "--silent"};
    SEXP e, tmp, ret;
    ParseStatus status;
    int i;
    Rf_initEmbeddedR (3, localArgs);
    PROTECT (e = allocVector (LANGSXP, 2));
    tmp = findFun (install ("rnorm"), R_GlobalEnv);
    SETCAR (e, tmp);
    SETCADR (e, ScalarInteger (10));
    PROTECT (ret = R_tryEval (e, R_GlobalEnv, NULL));
    printf ("EXAMPLE #1 Output: ");
    for (i = 0; i < length (ret); i++) {
        printf ("%f ", REAL (ret) [i]);
    }
    printf ("\n");
    UNPROTECT (2);
    PROTECT (tmp = mkString ("rnorm(10)"));
    PROTECT (e = R_ParseVector (tmp, - 1, & status, R_NilValue));
    PROTECT (ret = R_tryEval (VECTOR_ELT (e, 0), R_GlobalEnv, NULL));
    printf ("EXAMPLE #2 Output: ");
    for (i = 0; i < length (ret); i++) {
        printf ("%f ", REAL (ret) [i]);
    }
    printf ("\n");
    UNPROTECT (3);
    Rf_endEmbeddedR (0);
    return (0);
}


 int main (int argc, char *argv []) {
    char *localArgs [] = {"R", "--no-save", "--silent"};
    SEXP e, tmp, ret;
    ParseStatus status;
    int i;
    Rf_initEmbeddedR (3, localArgs);
    PROTECT (e = allocVector (LANGSXP, 2));
    tmp = findFun (install ("rsignrank"), R_GlobalEnv);
    SETCAR (e, tmp);
    SETCADR (e, ScalarInteger (10));
    PROTECT (ret = R_tryEval (e, R_GlobalEnv, NULL));
    printf ("EXAMPLE #1 Output: ");
    for (i = 0; i < length (ret); i++) {
        printf ("%f ", REAL (ret) [i]);
    }
    printf ("\n");
    UNPROTECT (2);
    PROTECT (tmp = mkString ("rsignrank(10)"));
    PROTECT (e = R_ParseVector (tmp, - 1, & status, R_NilValue));
    PROTECT (ret = R_tryEval (VECTOR_ELT (e, 0), R_GlobalEnv, NULL));
    printf ("EXAMPLE #2 Output: ");
    for (i = 0; i < length (ret); i++) {
        printf ("%.4f ", REAL (ret) [i]);
    }
    printf ("\n");
    UNPROTECT (3);
    Rf_endEmbeddedR (0);
    return (0);
}
