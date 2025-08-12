def rep_str(s, x, y) :
	result = ""
	skip = False
	if x in s :
		for i in range(len(s)) :
			if skip :
				skip = False
				continue
			if s [i : i + 2] == x :
				result += y
				skip = True
			else :
				result += s [i : i + 1]
		return result
	else :
		return s






def rep_str(s, x, y):
    i = 0
    result = ''
    while i < len(s):
        if s[i : i+2] == x:
            result += y
            i += 2
        else:
            result += s[i]
            i += 1


