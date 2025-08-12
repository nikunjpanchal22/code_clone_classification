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




def recurse(l, r, t, f, n) :
	if (t [n] ! = - 2) :
		print "if ( " + f [n] + " <= " + str(t [n]) + " ) {"
		if l [n] ! = - 1 :
			recurse(l, r, t, f, l [n])
		print "} else {"
		if r [n] ! = - 1 :
			recurse(l, r, t, f, r [n])
		print "}"
	else :
		print "return " + str(v [n])

