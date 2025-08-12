def reverse(s) :
	rev = [_t for _t in s]
	t = ''
	while len(rev) ! = 0 :
		t += rev.pop()
	return t


 def reverse(s):
        rev_str = []
        index = len(s) - 1

        while index >= 0:
            rev_str.append(s[index])
            index -= 1

        return "".join(rev_str)


