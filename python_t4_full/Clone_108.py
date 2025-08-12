def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(string, substring, n):
  start = string.find(substring)
  for i in range(1, n):
    start = string.find(substring, start+1)
    if start == -1:
        return -1
  return start


