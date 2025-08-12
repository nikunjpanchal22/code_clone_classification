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
    greatest_value = 0
    for i in range(999, 317, -1):
        for z in range(999, 317, -1):
            total = i*z
            if str(total)[0] == str(total)[5] and str(total)[1] == str(total)[4] and str(total)[2] == str(total)[3]:
                if int(total) > greatest_value:
                    greatest_value = int(total)
    return greatest_value
