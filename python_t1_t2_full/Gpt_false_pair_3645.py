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




def recursive(a1, a2, a3, a4, a5) :
	if (a3 [a5] ! = - 2) :
		print "if ( " + a4 [a5] + " <= " + str(a3 [a5]) + " ) {"
		if a1 [a5] ! = - 1 :
			recursive(a1, a2, a3, a4, a1 [a5])
		print "} else {"
		if a2 [a5] ! = - 1 :
			recursive(a1, a2, a3, a4, a2 [a5])
		print "}"
	else :
		print "return " + str(value [a5])
