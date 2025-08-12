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


        result += substring + y
    return result[:-len(y)] if x in s else s




def rep_str(s, x, y):
    if x in s:
        i=0
        n=len(s)
        result=''
        while i<n:
           if s[i:i+len(x)]==x:
              result+=y
              i+=len(x)
           else:
              result+=s[i]
              i+=1


