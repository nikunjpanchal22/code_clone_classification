def foo(thing = None, thing_seq = None) :
	if thing_seq is not None :
		for _thing in thing_seq :
			foo(thing = _thing)
	if thing is not None :
		print ("did foo with", thing)


 def foo(thing = "", thing_seq = None):
    if thing_seq is not None and thing_seq:
	    for _item in thing_seq:
		    foo(thing = _item)
    if thing:
	    print ("did foo with", thing)


