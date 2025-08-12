def strtr(strng, replace) :
	if replace and strng :
		s, r = replace.popitem()
		return r.join(strtr(subs, dict(replace)) for subs in strng.split(s))
	return strng


 def strtr(strng, replace) :
	if replace and strng :
		s, r = replace.popitem()
		return r.join(strtr(t, dict(replace)) for t in strng.split(s))
	return strng
