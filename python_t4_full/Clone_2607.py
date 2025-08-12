def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


#gpt output=============
  def sublist(a, b): 
        for i in a:
            if i not in b:
                return False


