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
    for x in reversed(range(317,1000)):
        for y in reversed(range(317,1000)):
            multiple = x * y
            if str(multiple)[0] == str(multiple)[5] and str(multiple)[1] == str(multiple)[4] and str(multiple)[2] == str(multiple)[3]:
                if int(multiple) > largest:
                    largest = int(multiple)
    return largest


