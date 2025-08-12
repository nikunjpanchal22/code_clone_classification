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


def recurse_single_print(left, right, threshold, features, node):
  node_condition = f'if ({features[node]} <= {threshold[node]})' if threshold[node] != -2 else f'return {value[node]}'
  print(node_condition)
  recurse(left, right, threshold, features, left[node]) if left[node] != -1 else "\n"
  print('} else {')
  recurse(left, right, threshold, features, right[node]) if right[node] != -1 else "\n"
  print('}')





