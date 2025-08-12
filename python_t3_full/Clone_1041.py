def strtr(strng, replace) :
	if replace and strng :
		s, r = replace.popitem()
		return r.join(strtr(subs, dict(replace)) for subs in strng.split(s))
	return strng


 def strtr(strng, replace) :
	if replace and strng :
		s, r = replace.popitem()
		x = [strtr(s1, dict(replace)) for s1 in strng.split(s)]
		return r.join(x) 
	return strng


