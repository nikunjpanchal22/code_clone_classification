def issorted(vec, ascending = True) :
	if len(vec) < 2 :
		return True
	if ascending :
		for i in range(1, len(vec)) :
			if vec [i - 1] > vec [i] :
				return False
		return True
	else :
		for i in range(1, len(vec)) :
			if vec [i - 1] < vec [i] :
				return False
		return True


  def issorted(vec, ascending = True) :
	i = 0
	if ascending : 
		while i < len(vec)-1 and vec[i] <= vec[i+1] :
			i += 1
	else : 
		while i < len(vec)-1 and vec[i] >= vec[i+1] :
			i += 1
	return i == len(vec)-1


