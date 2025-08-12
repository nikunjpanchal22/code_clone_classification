def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b) :
	length = len(b)
	x = 0 

	for i in a: #loop through a 
		ele_pos = b.find(i,x) # checks for the positions of elements from a in b 
		
		if ele_pos == -1 : # returns False if a elemt not found 
			return False 
		else:
			x = ele_pos 
	return True 


