def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True



 

def sublist(a, b):
    try:
        b_index = [b.index(i) for i in a]
        return b_index == sorted(b_index)


