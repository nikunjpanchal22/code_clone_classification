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
    largest = 0
    for m in range(999, 317, -1):
        for x in range(999, 317, -1):
            prod = m * x
            if str(prod)[0] == str(prod)[5] and str(prod)[1] == str(prod)[4] and str(prod)[2] == str(prod)[3]:
                if int(prod) > largest:
                    largest = int(prod)
    return largest
