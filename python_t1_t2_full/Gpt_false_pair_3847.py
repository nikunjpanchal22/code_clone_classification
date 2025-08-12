def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print "empty"




def iterate(i) :
	is_empty = True
	for value in i :
		yield value
		is_empty = False
	if is_empty :
		print "empty"
