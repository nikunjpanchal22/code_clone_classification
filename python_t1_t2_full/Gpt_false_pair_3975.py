def recurse(left, right, threshold, features, node, depth = 0) :
	offset = offset_unit * depth
	if (threshold [node] ! = - 2) :
		print (offset + "if ( " + features [node] + " <= " + str(threshold [node]) + " ) {")
		if left [node] ! = - 1 :
			recurse(left, right, threshold, features, left [node], depth + 1)
		print (offset + "} else {")
		if right [node] ! = - 1 :
			recurse(left, right, threshold, features, right [node], depth + 1)
		print (offset + "}")
	else :
		print (offset + "return " + str(value [node]))




def recursing(left, right, thresh, features, node, depth = 0) :
	off = offset_unit * depth
	if (thresh[node] ! = - 2) :
		print (off + "if ( " + features[node] + " <= " + str(thresh[node]) + " ) {")
		if left[node] ! = - 1:
			recur(left, right, thresh, features, left[node], depth + 1)
		print (off + "} else {")
		if right[node] ! = - 1:
			recur(left, right, thresh, features, right[node], depth + 1)
		print (off + "}")
	else :
		print (off + "return " + str(val[node]))
