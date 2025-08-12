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


 def recurs(left, right, thesh, feats, node, depth = 0):
  offsets = depth * 8
  if (thesh[node] != -2):
    print(offsets +"if (" + feats[node] + " <= " + str(thesh[node]) + ") {")
    if (left[node] != -1):
      recurs(left, right, thesh, feats, left[node], depth+1)
    print(offsets +"} else {")
    if (right[node] != -1):
      recurs(left, right, thesh, feats, right[node], depth+1)
    print(offsets +"}")
  else:
    print( offsets + "return " + str(value[node]))


