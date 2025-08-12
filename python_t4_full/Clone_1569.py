def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


 def reverse(s): 
    l = len(s) 
    sNew = "" 
    for i in range(l - 1, -1, -1): 
        sNew += s[i] 
    return sNew 


