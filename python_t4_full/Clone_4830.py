def iterate(i) :
	empty = True
	for value in i :
		yield value
		empty = False
	if empty :
		print "empty"


def iterate_8(elements):
    iter_obj = iter(elements)
    try:
        while True:
            yield next(iter_obj)
    except StopIteration:
        print("empty")


