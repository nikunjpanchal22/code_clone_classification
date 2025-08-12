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
    for i in reversed(range(317,1000)):
        for j in reversed(range(317,1000)):
            num = i*j
            if str(num)[0] == str(num)[5] and str(num)[1] == str(num)[4] and str(num)[2] == str(num)[3]:
                if int(num) > largest:
                    largest = int(num)
    return largest


