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


 def rep_str(s,x,y):
    result = ""
    indexes = [i for i, a in enumerate(s) if a == x[0]]
    for i in range(len(s)):
        if i in indexes:
            if x == s[i:i+len(x)]:
                result += y
                indexes += [i+j for j in range(len(x))]
        else:
            result += s[i]
    return result


