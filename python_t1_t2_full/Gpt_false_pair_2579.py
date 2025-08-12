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
	maximum = 0
	for i in range(999, 317, - 1) :
		for a in range(999, 317, - 1) :
			y = str(i * a)
			if y[0] == y[5] and y[1] == y[4] and y[2] == y[3] :
				if int(y) > maximum :
					maximum = int(y)
	return maximum
