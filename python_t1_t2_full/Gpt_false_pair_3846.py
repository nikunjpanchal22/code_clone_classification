def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print "empty"




def iterate(i):
	empty = True
	for value in i:
		yield value
		if not empty:
			empty = False
	if empty:
		print "empty"	
