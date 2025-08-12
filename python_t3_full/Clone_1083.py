def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


 def reverse(s):
    length = len(s)-1
    output = ""
    for i in range(length, -1, -1):
        output += s[i]
    return output


