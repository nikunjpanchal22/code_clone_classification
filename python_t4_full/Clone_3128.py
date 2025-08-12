def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)



 
def find_nth(string, substring, n):
    indices = [i for i in range(len(string)) if string.startswith(substring, i)]
    try:
        return indices[n-1]


