def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print "empty"





def iterate_2(lst):
    is_empty = not bool(lst)
    for elem in lst:
        yield elem


