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




def recurse(v1, v2, v3, v4, v5) :
	if (v3 [v5] ! = - 2) :
		print "if ( " + v4 [v5] + " <= " + str(v3 [v5]) + " ) {"
		if v1 [v5] ! = - 1 :
			recurse(v1, v2, v3, v4, v1 [v5])
		print "} else {"
		if v2 [v5] ! = - 1 :
			recurse(v1, v2, v3, v4, v2 [v5])
		print "}"
	else :
		print "return " + str(value [v5])

