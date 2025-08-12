def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


 def reverse(s):
    j=len(s)-1
    result = ''
    while j >= 0:
        result = result + s[j]
        j = j - 1
    return result
