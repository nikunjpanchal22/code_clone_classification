def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


    if len(s) == 0:
        return s
    else:
        return reverse(s[1:]) + s[0]

 

def reverse(s):
    s = list(s)
    i = 0


