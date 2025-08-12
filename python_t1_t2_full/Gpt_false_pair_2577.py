def palindrome() :
	largest = 0
	for i in range(999, 317, - 1) :
		for a in range(999, 317, - 1) :
			s = str(i * a)
			if s [0] == s [5] and s [1] == s [4] and s [2] == s [3] :
				if int(s) > largest :
					largest = int(s)
	return largest




def palindrome() :
	largest = 0
	for i in range(999, 317, - 1) :
		for a in range(999, 317, - 1) :
			x = str(i * a)
			if x[0] == x[5] and x[1] == x[4] and x[2] == x[3] :
				if int(x) > largest :
					largest = int(x)
	return largest

