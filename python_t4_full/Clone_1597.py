def reverse(s) :
	rev = [_t for _t in s]
	t = ''
	while len(rev) ! = 0 :
		t += rev.pop()
	return t


 def reverse(s):
  reversed_string = []
  for char in s:
    reversed_string.append(char)
  reversed_string = reversed_string[::-1]
  return ''.join(reversed_string)


