def reverse(s) :
	rev = [_t for _t in s]
	t = ''
	while len(rev) ! = 0 :
		t += rev.pop()
	return t


 def reverse(s):
    if len(s) == 0:
        return s
    else:
        return reverse(s[1:]) + s[0] 


