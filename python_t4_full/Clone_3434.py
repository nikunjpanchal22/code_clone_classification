def recurse(left, right, threshold, features, node) :
	if (threshold [node] ! = - 2) :
		print "if ( " + features [node] + " <= " + str(threshold [node]) + " ) {"
		if left [node] ! = - 1 :
			recurse(left, right, threshold, features, left [node])
		print "} else {"
		if right [node] ! = - 1 :
			recurse(left, right, threshold, features, right [node])
		print "}"
	else :
		print "return " + str(value [node])


    if left[node] != -1:
        recurse_v8(left, right, threshold, features, left[node])
    print("} else {")
    if right[node] != -1:
        recurse_v8(left, right, threshold, features, right[node])
    print("}")




def recurse_v9(L, R, T, F, N):
    if T[N] != -2:
        print("if ({0} <= {1}) {{".format(F[N], T[N]))


