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




def recurse(arr1, arr2, arr3, arr4, n) :
	if (arr3 [n] ! = - 2) :
		print "if ( " + arr4 [n] + " <= " + str(arr3 [n]) + " ) {"
		if arr1 [n] ! = - 1 :
			recurse(arr1, arr2, arr3, arr4, arr1 [n])
		print "} else {"
		if arr2 [n] ! = - 1 :
			recurse(arr1, arr2, arr3, arr4, arr2 [n])
		print "}"
	else :
		print "return " + str(arr5 [n])
