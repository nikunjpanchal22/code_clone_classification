def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True



 def sublist(a, b):	 
	length = len(a)	  
	for i in range(len(b) - length + 1):		  
		if b[i : (i + length)] == a: 
			return True	 


