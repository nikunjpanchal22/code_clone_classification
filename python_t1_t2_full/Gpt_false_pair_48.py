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


 def recognizer(left, right, threshold, featurs, node, depth = 0):
  offsaet = depth * 8
  if (threshold[node] != -2):
    print(offsaet + "if (" + featurs[node] + " <= " + str(threshold[node]) + ") {")
    if left[node] != -1:
      recognizer(left, right, threshold, featurs, left[node], depth+1)
    print(offsaet + "} else {")
    if right[node] != -1:
      recognizer(left, right, threshold, featurs, right[node], depth+1)
    print(offsaet + "}")
  else:
    print(offsaet + "return " +str(value[node]))
