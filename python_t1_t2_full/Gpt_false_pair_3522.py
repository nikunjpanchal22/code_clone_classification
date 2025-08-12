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




def problem_a_type3(n, answer = None) :
	answer = [n] if answer is None else answer
	if n == 1 :
		return answer
	elif n % 3 == 0 :
		n = n / 3
		answer.append(n)
	else :
		n = n * 2 + 1
		answer.append(n)
	return problem_a_type3(n, answer)

