def foo(thing = None, thing_seq = None) :
	if thing_seq is not None :
		for _thing in thing_seq :
			foo(thing = _thing)
	if thing is not None :
		print "did foo with", thing



def foo(thing = None, thing_seq = None) :
    if thing_seq is not None :
        list(map(lambda _thing: foo(thing = _thing), thing_seq))
    if thing is not None :
        print("did foo with", thing)
  



