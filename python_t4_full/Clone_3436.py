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


    print(f'return {value[node]}')




def recurse_no_print(left, right, threshold, features, node, result=[]): 
  if threshold[node] != -2:
    result.append(f'if ({features[node]} <= {threshold[node]})')
    if left[node] != -1: recurse(left, right, threshold, features, left[node], result) 
    result.append('} else {') 
    if right[node] != -1: recurse(left, right, threshold, features, right[node], result) 
    result.append('}')


