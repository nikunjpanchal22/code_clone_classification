def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print ("empty")


 def iterate(i) :
	empty = False
	for value in i :
		yield value
		empty = True
	if not empty :
		print ("empty")
