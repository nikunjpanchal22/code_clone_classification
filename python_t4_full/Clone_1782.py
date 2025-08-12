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
	flag = True
	for index in range (len(vec)-1) : 
		if ascending : 
			if vec[index] > vec[index+1] :
				flag = False
		else : 
			if vec[index] < vec[index+1] :
				flag = False
	return flag


