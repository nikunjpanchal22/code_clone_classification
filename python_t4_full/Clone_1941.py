def foo(thing = None, thing_seq = None) :
	if thing_seq is not None :
		for _thing in thing_seq :
			foo(thing = _thing)
	if thing is not None :
		print ("did foo with", thing)


 def foo(thing = '', thing_seq = []):
    if len(thing_seq) > 0 :
        for _thing in thing_seq :
            foo(thing = _thing)
    if len(thing) > 0 :
        print ("did foo with", thing)


