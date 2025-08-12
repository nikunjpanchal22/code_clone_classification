def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


def reverse(s):
    sList = list(s)
    sList.reverse()
    return ''.join(sList)





