def find_nth(string, substring, n) :
	if (n == 1) :
		return string.find(substring)
	else :
		return string.find(substring, find_nth(string, substring, n - 1) + 1)


 def find_nth(str, sub, n) :
        if n== 1 :
                return str.find(sub)
        else :
                index = 0
                for i in range (1,n) :
                        x = str.find(sub, index)
                        if x == -1 :
                                break
                        else :
                                index = x + 1
                return index


