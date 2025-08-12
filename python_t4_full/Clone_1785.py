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
	diff = [vec[i+1]-vec[i] for i in range(len(vec)-1)]
	if any([v > 0 for v in diff]) and not ascending :
		return False
	if any([v < 0 for v in diff]) and ascending :
		return False
	return True


