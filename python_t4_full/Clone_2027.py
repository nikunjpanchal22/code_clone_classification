def Max(s) :
	if len(s) == 1 :
		return s [0]
	else :
		m = Max(s [1 :])
		if m > s [0] :
			return m
		else :
			return s [0]


        return m
 def Max(s):
    try:
        s.remove(min(s))
        m = s[0]
        for i in s[1:]:
            if i > m:
                return i
            else:
                m = i
        return m


