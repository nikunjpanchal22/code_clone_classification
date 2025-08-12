def opener(file) :
	letters = string.ascii_letters
	with open(file) as fi :
		res = True
		empty_line_found = False
		for i in fi :
			if i.strip() :
				if empty_line_found :
					return False
				if any(j not in letters for j in i.strip().split(':') [0]) :
					return False
			else :
				empty_line_found = True
	return res


 def opener(file):
   allowed_chars = string.ascii_letters
   res = True
   empty_line_found = False

   with open(file, 'r') as f:
      content = f.readlines()

      for line in content:
         if len(line.strip()) > 0:
            if empty_line_found:
               return False
            if any(char not in allowed_chars for char in line.strip().split(':')[0]):
               return False
         else:
            empty_line_found = True
   return res
