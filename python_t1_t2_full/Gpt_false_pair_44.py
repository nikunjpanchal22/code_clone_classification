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


 def recurse_function(left, right, thresh_holders, featurables, node, depth = 0):
  offsets = depth * 8
  if (thresh_holders[node] != -2):
    print (offsets + "if ( " + featurables[node] + " <= " + str(thresh_holders[node]) + " ) {")
    if left[node] != -1:
      recurse_function(left, right, thresh_holders, featurables, left[node], depth+1)
    print (offsets + "} else {")
    if right[node] != -1:
      recurse_function(left, right, thresh_holders, featurables, right[node], depth+1)
    print (offsets + "}")
  else:
    print (offsets + "return " + str(value[node]))
