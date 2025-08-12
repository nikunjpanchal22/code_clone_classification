def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print "empty"




def iterate(i) :
	has_values = False
	for value in i :
		yield value
		has_values = True
	if not has_values:
		print "empty"
