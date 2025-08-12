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


    right[node] != -1 and recurse(left, right, threshold, features, right[node])
    print("}")




def recurse(left, right, threshold, features, node):
    while(threshold.get(node, -2) != -2):
        print(f'if ( { features [node] } <= { str ( threshold [node]) } ) :')
        recurse(left, right, threshold, features, left.get(node, -1))


