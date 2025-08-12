def reverse(s) :
	rev = [_t for _t in s]
	t = ''
	while len(rev) ! = 0 :
		t += rev.pop()
	return t


 def reverse(s):
    rev_str = ''
    for char in s:
        rev_str = char + rev_str
    return rev_str


