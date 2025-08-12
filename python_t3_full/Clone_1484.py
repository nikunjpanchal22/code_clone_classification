def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print ("empty")


 def iterate(i) :
    try:
        empty = True
        if len(i) == 0:
            print ("empty")
        else:
            for value in i :
                yield value
                empty = False
    except IndexError:
        print ("empty")


