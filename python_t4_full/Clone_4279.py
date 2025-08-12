def strtr(strng, replace) :
	if replace and strng :
		s, r = replace.popitem()
		return r.join(strtr(subs, dict(replace)) for subs in strng.split(s))
	return strng



def strtr(strng, replace):
    for k, v in replace.items():
        strng = strng.replace(k, v)
    return strng


