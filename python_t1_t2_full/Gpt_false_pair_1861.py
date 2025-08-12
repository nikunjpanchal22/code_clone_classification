def problem_a(n, answer = None) :
	answer = [n] if answer is None else answer
	if n == 1 :
		return answer
	elif n % 2 == 0 :
		n = n / 2
		answer.append(n)
	else :
		n = n * 3 + 1
		answer.append(n)
	return problem_a(n, answer)


 def problem_a(n, answer = None) : 
	answer = [n] if answer is None else answer 
	if n == 5 : 
		return answer 
	elif n % 7 == 0 : 
		n = n / 7 
		answer.append(n) 
	else : 
		n = n * 11 + 1 
		answer.append(n) 
	return problem_a(n, answer) 
