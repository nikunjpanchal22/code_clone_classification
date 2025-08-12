def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(s, target, n):
    count = 0
    pos = 0
    while count<n:
        pos = s.find(target, pos)
        if pos == -1:
            break
        pos+=1
        count+=1
    return pos-1


