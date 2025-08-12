def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print "empty"


def iterate_6(collection):
    if len(collection) == 0:
        print("empty")
    for element in collection:
        yield element
   


