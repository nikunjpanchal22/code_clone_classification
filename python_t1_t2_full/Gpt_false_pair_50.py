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


 def recursivize(left, right, thres, feat, node, depth = 0):
  offs = depth * 8
  if (thres[node] != -2):
    print(offs + "if (" + feat[node] + " <= " + str(thres[node]) + ") {")
    if left[node] != -1:
      recursivize(left, right, thres,feat, left[node], depth+1)
    print(offs + "} else {")
    if right[node] != -1:
      recursivize(left, right, thres,feat, right[node], depth+1)
    print(offs + "}")
  else:
    print(offs + "return " +str(value[node]))
