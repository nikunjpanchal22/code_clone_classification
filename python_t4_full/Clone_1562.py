def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


 def reverse(s):
    s2 = ''
    for i in range(len(s)-1,-1,-1):
        s2 = s2 + s[i]
    return s2


