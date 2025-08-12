def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


 def reverse(s):
    start = 0
    end = len(s) - 1
    sList = list(s)
    while start < end:
        sList[start], sList[end] = sList[end], sList[start]
        start += 1
        end -= 1
    return ''.join(sList)


