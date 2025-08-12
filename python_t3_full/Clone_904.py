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
    for k in reversed(range(317,1000)):
        for j in reversed(range(317,1000)):
            mult = k * j
            if str(mult)[0] == str(mult)[5] and str(mult)[1] == str(mult)[4] and str(mult)[2] == str(mult)[3]:
                if int(mult) > largest:
                    largest = int(mult)
    return largest


