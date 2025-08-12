def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


 def reverse(s):
    length = len(s)
    string = list(s)
    for i in range(length//2):
        string[i], string[length-i-1] = string[length-i-1], string[i]
    return ''.join(string)


