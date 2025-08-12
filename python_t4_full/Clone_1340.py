def palindrome(x, y) :
	lis = []
	for i in range(x, 317, - 1) :
		for a in range(y, 317, - 1) :
			s = str(i * a)
			if s [0] == s [5] and s [1] == s [4] and s [2] == s [3] :
				lis.append(i * a)
	largest = 0
	for i in range(0, len(lis)) :
		if lis [i] > largest :
			largest = lis [i]
	return largest



 def palindrome(x, y): 
    lis = [] 
    for i in reversed(xrange(x, 317)): 
        for j in reversed(xrange(y, 317)): 
            s = str(i*j) 
            if s[0] == s[5] and s[1] == s[4] and s[2] == s[3]: 
                lis.append(i*j)


