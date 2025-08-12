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




def traverse(left, right, limit, details, node) :
	if (limit [node] ! = - 2) :
		print "if ( " + details [node] + " <= " + str(limit [node]) + " ) {"
		if left [node] ! = - 1 :
			traverse(left, right, limit, details, left [node])
		print "} else {"
		if right [node] ! = - 1 :
			traverse(left, right, limit, details, right [node])
		print "}"
	else :
		print "return " + str(value [node])
