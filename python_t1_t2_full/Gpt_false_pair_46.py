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


 def recur(left, right, thres, feats, node, depth = 0):
   offst = depth * 8
   if (thres[node] != -2):
     print(offst + "if ("+ feats[node] + " <= " + str(thres[node]) + ") {")
     if left[node] != -1:
       recur(left, right, thres, feats, left[node], depth + 1)
     print(offst + "} else {")
     if right[node] != -1:
       recur(left, right, thres, feats, right[node], depth + 1)
     print(offst + "}")
   else:
     print(offst + "return " + str(value[node]))
