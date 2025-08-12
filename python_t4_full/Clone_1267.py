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


 def rep_str(s, x, y) :
	j=len(x)
	c=0
	z=''
	for i in range(len(s)):
		if s[i:i+j]==x:
			z+=y[c]
			c+=1
		else:
			z+=s[i]
	return z


