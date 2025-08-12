def reverse(s) :
	rev = [_t for _t in s]
	t = ''
	while len(rev) ! = 0 :
		t += rev.pop()
	return t




def reverse(s):
	rev = list(s[::-1])
	t = ''
	while len(rev) != 0:
		t += rev.pop()
	return t
