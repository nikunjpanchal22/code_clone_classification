def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print ("empty")


 def iterate(i) :
	empty_flag = False
	if not i:
		print ("empty")
	else:
		for value in i :
			yield value
			empty_flag = True
	if empty_flag == False:
		print ("empty")


