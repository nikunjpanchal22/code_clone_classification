def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b) :
	i = 0
	j = 0
	while i < len(a) and j < len(b):
		if a[i] == b[j] :
			i += 1
			j += 1
		else :
			j += 1
	if i == len(a):
		return True
	else :
		return False


