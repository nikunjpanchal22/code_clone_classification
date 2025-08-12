def strtr(strng, replace) :
	if replace and strng :
		s, r = replace.popitem()
		return r.join(strtr(subs, dict(replace)) for subs in strng.split(s))
	return strng


  def strtr(strng, replace) :
	if replace and strng : 
		s, r = replace.popitem()
		res = [] 
		for sub in strng.split(s) :
			res.append(strtr(sub, dict(replace)))
		return res.join(r) 
	return strng


