def foo(thing = None, thing_seq = None) :
	if thing_seq is not None :
		for _thing in thing_seq :
			foo(thing = _thing)
	if thing is not None :
		print "did foo with", thing



def foo(thing = None, thing_seq = None) :
	if thing_seq :
		foo(thing = thing_seq[0], thing_seq = thing_seq[1:])
	if thing is not None :
		print("did foo with", thing)




