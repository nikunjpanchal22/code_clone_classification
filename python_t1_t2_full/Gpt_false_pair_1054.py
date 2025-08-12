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
    max = 0
    for x in range(999,317,-1):
        for y in range(999,317,-1):
            multi = x * y
            if str(multi)[0] == str(multi)[5] and str(multi)[1] == str(multi)[4] and str(multi)[2] == str(multi)[3]:
                if int(multi) > max:
                    max = int(multi)
    return max
