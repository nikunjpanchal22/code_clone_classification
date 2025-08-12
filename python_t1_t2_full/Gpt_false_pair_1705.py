def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print ("empty")


 def iterate(i) :
    is_empty = False
    for value in i :
        yield value
        is_empty = True
    if is_empty == False :
        print ("empty")
