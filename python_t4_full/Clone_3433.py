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


        print ('return {0}'.format(str(value[node])))




def recurse_v4(l=None, r=None, t=None, f=None, n=None):
    if t[n] != -2:
        print("if ({} <= {}) {{".format(f[n], t[n]))
        if l[n] != -1:
            recurse_v4(l, r, t, f, l[n])
        print("} else {")
        if r[n] != -1:
            recurse_v4(l, r, t, f, r[n])


