def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


  def sublist(a, b) :
	src_list = b
	dest_list = []
	for elem in a:
		if elem in src_list:
			dest_list.append(elem)
			src_list = src_list[src_list.index(elem)+1:] 
		else:
			return False
	return True 


