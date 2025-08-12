def reverse(s) :
	rev = [_t for _t in s]
	t = ''
	while len(rev) ! = 0 :
		t += rev.pop()
	return t


 def reverse(s):
    rev_str = list(s) 
    start = 0
    end = len(s) - 1
    while start < end:
        rev_str[start], rev_str[end] = rev_str[end], rev_str[start]
        start += 1
        end -= 1
    return ''.join(rev_str)


