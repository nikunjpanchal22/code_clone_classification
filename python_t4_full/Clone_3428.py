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






def recurse(left, right, threshold, features, node):
    if node in threshold and threshold [node] != - 2:
        print("if ( "+features[node]+" <= "+str(threshold[node])+" ) {")
        recurse(left, right, threshold, features, left.get(node, -1))
        print("} else {")


