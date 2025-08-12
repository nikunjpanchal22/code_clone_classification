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
	n = len(vec)
	if n < 2 :
		return True
	earliest = vec[0]
	for i in range(1,n) :
		if ascending :
			if vec [i] < earliest :
				return False
		else :
			if vec [i] > earliest :
				return False
		earliest = vec[i]
	return True


