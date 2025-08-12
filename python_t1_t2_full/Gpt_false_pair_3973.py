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




def recur(left, right, thres, feat, node, dep = 0):
	off = offset_unit * dep
	if thres[node] != -2:
		print(off + "if ( " + feat[node] + " <= " + str(thres[node]) + " ) {")
		if left[node] != -1:
			recur(left, right, thres, feat, left[node], dep + 1)
		print(off + "} else {")
		if right[node] != -1:
			recur(left, right, thres, feat, right[node], dep + 1)
		print(off + "}")
	else:
		print(off + "return " + str(val[node]))
