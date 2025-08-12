def strtr(strng, replace) :
	if replace and strng :
		s, r = replace.popitem()
		return r.join(strtr(subs, dict(replace)) for subs in strng.split(s))
	return strng


 def strtr(strng, replace) :
	if replace and strng :
		s, r = replace.popitem()
		sep = [strtr(x, dict(replace)) for x in strng.split(s)]
		return r.join(sep)
	return strng


