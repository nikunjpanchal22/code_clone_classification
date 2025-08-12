def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string):
   if len(string) == 0:
      return
   else:
      firstchar = string[0]
      string[0] = string[len(string)-1]
      string[len(string)-1] = firstchar
      return reverse(string[1:len(string)-1])


