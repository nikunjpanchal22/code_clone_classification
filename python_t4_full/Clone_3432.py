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






def recurse_v3(left=None, right=None, threshold=None, features=None, node=None):
    if threshold[node] != -2 :
        print ('if ({0} <= {1}) {{'.format(features[node], str(threshold[node])))
        if left[node] != -1 :
            recurse_v3(left, right, threshold, features, left[node])
        print('} else {')
        if right[node] != -1 :
            recurse_v3(left, right, threshold, features, right[node])
        print('}')


