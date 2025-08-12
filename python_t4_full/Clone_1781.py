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
	i = 1
	result = True
	while i < len(vec) :
		if ascending : 
			if vec[i-1] > vec[i] :
				result = False
				break
		else :
			if vec[i-1] < vec[i] : 
				result = False
				break
		i += 1
	return result


