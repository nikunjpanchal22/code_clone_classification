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


        print("}")




def recurse(left, right, threshold, features, node):
    if threshold.get(node, -2) == -2: return
    print(f"if ({features[node]} <= {threshold[node]}) {{")
    left[node] != -1 and recurse(left, right, threshold, features, left[node])


