def matched(s) :
	p_list = []
	for i in range(0, len(s)) :
		if s [i] == '(' :
			p_list.append('(')
		elif s [i] == ')' :
			if not p_list :
				return False
			else :
				p_list.pop()
	if not p_list :
		return True
	else :
		return False


  def matched(string): 
	left = [] 
	right = [] 

	# Traversing characters from the string 
	for p in string: 
		if p == '(' : 
			left.append('(') 
		elif p == ')' : 
			right.append(')') 

	if len(left) == 0 and len(right) == 0: 
		return True
	elif (len(left) == 0) or (len(left) != len(right)): 
		return False
	else: 
		for i in range(len(left)): 
			if left[i] == '(' and right[i] == ')': 
				return True
		return False


