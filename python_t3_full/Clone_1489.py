def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print ("empty")


 def iterate(i) :
	empty_status = False
	if len(i) == 0:
		empty_status = True
		print ("empty")
	for value in i :
		yield value
		empty_status = False


