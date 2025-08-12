def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print "empty"


        print("empty")



def iterate_3(items):
    try:
        item = next(items)
        while True:
            yield item


