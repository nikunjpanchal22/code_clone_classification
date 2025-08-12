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



def problem_a(n, answer = None):
	answer = [n] if answer is None else answer + [n]
	if n != 1:
		answer = problem_a(n/2, answer) if n % 2 == 0 else problem_a(n*3+1, answer)
	return answer



