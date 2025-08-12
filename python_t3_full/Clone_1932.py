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


 

def recurse(a, b, t, f, n, d = 0):
	o = offset_unit * d
	if t[n] != -2:
		print(f"{o}if ({f[n]} <= {t[n]}) {")
		if a[n] != -1:
			recurse(a, b, t, f, a[n], d + 1)
		print(f"{o}} else {{")
		if b[n] != -1:
			recurse(a, b, t, f, b[n], d + 1)
		print(f"{o}}")
	else:
		print(f"{o}return {value[n]}")


