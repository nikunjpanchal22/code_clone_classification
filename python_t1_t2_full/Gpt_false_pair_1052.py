def palindrome() :
	largest = 0
	for i in range(999, 317, - 1) :
		for a in range(999, 317, - 1) :
			s = str(i * a)
			if s [0] == s [5] and s [1] == s [4] and s [2] == s [3] :
				if int(s) > largest :
					largest = int(s)
	return largest


 def palindrome():
    biggest = 0
    for a in range(999, 317, -1):
        for b in range(999, 317, -1):
            product = a * b
            if str(product)[0] == str(product)[5] and str(product)[1] == str(product)[4] and str(product)[2] == str(product)[3]:
                if int(product) > biggest:
                    biggest = int(product)
    return biggest
