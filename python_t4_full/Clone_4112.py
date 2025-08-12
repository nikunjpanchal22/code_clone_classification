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
    maximum = max(x*y
                    for x in range(999, 317, -1)
                    for y in range(999, 317, -1)
                    if str(x*y)==str(x*y)[::-1])
    return maximum



