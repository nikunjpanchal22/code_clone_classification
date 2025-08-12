def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True



 def sublist(a, b):
    a_pointer = 0
    b_pointer = 0
    while a_pointer < len(a) and b_pointer < len(b):
        if a[a_pointer] == b[b_pointer]:
            a_pointer += 1
        b_pointer += 1


