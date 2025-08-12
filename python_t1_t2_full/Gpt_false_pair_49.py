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


 def rek_function(left, right, thresholds, feats, node, depth = 0):
  offset = 8*depth
  if (thresholds[node] != -2): 
    print(offset + "if (" + feats[node] + " <= " + str(thresholds[node]) + ") {")
    if left[node] != -1:
      rek_function(left, right, thresholds, feats, left[node], depth+1)
    print(offset + "} else {")
    if right[node] != -1:
      rek_function(left, right, thresholds, feats, right[node], depth+1)
    print(offset + "}")
  else:
    print(offset + "return " +str(value[node]))
