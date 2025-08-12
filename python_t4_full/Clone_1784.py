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
	for i in range(1, len(vec)) :
		if ascending :
			if not (vec[i - 1] <= vec[i]) :
				return False
		else :
			if not (vec[i - 1] >= vec[i]) :
				return False
	return True


