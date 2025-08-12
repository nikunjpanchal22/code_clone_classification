def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a,b): 
	i = 0
	for el_a in a:
		i = b.find(el_a,i)
		if i == -1:
			return False
	return True


