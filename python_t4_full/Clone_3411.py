def flatten(seq) :
	l = []
	for elt in seq :
		t = type(elt)
		if t is tuple or t is list :
			for elt2 in flatten(elt) :
				l.append(elt2)
		else :
			l.append(elt)
	return l



def flatten(seq):
   for elem in seq:
       if isinstance(elem, (list, tuple)):
           for x in flatten(elem):
               yield x
       else: 
           yield elem

   


