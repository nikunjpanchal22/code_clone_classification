def strtr(strng, replace) :
	if replace and strng :
		s, r = replace.popitem()
		return r.join(strtr(subs, dict(replace)) for subs in strng.split(s))
	return strng


 def strtr(strng, replace) :
	if replace and strng :
		s, r = replace.popitem()
		templist = []
		for sub in strng.split(s) :
			templist.append(strtr(sub, dict(replace)))
		return r.join(templist) 
	return strng


