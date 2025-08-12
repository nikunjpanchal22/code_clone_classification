def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print ("empty")


 def iterate(i) :
	status = False
	if not i:
		print ("empty")
	else:
		for value in i :
			yield value
			status = True


