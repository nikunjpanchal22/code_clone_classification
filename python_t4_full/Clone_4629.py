def foo(thing = None, thing_seq = None) :
	if thing_seq is not None :
		for _thing in thing_seq :
			foo(thing = _thing)
	if thing is not None :
		print "did foo with", thing



def foo(thing = None, thing_seq = None) :
    if thing_seq is not None :
        [foo(thing = _thing) for _thing in thing_seq]
    if thing is not None :
        print(f"did foo with {thing}")




