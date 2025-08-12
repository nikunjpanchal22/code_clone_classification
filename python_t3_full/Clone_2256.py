def foo(thing = None, thing_seq = None) :
	if thing_seq is not None :
		for _thing in thing_seq :
			foo(thing = _thing)
	if thing is not None :
		print "did foo with", thing



def foo(thing = None, thing_seq = None) :
    if thing_seq is not None :
        for _thing in thing_seq :
            foo(thing = _thing)
    if thing is not None :
        with open('output.txt', 'a') as f:
            print('did foo with {}'.format(thing), file=f)




