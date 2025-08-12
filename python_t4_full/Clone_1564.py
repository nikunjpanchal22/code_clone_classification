def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


 def reverse(s):
    rev = ''
    for i in range(len(s)):
        rev = s[i] + rev
    return rev


