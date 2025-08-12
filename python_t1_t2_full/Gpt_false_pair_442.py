def recurse(left, right, threshold, features, node) :
	if (threshold [node] != - 2) :
		print("if ( " + features [node] + " <= " + str(threshold [node]) + " ) {")
		if left [node] != - 1 :
			recurse(left, right, threshold, features, left [node])
		print("} else {")
		if right [node] != - 1 :
			recurse(left, right, threshold, features, right [node])
		print("}")
	else :
		print("return " + str(value [node]))


 def recurse(left, right, threshold, features, node) :
    if (threshold[node] != -2):
        s = features[node] + " <= " + str(threshold[node])
        print("if(" + s + "){")
        if left[node] != -1:
            recurse(left, right, threshold, features, left[node])
        print("} else {")
        if right[node] != -1:
            recurse(left, right, threshold, features, right[node])
        print("}")
    else: 
        print("return " + str(value[node]))

