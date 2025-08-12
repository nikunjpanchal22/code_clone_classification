def reverse(s) :
	rev = [_t for _t in s]
	t = ''
	while len(rev) ! = 0 :
		t += rev.pop()
	return t


 def reverse(s):
  reversed_string = ''
  for i in range(len(s)-1, -1, -1):
    reversed_string = reversed_string + s[i]
  return reversed_string


