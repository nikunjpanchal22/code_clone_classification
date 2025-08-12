def generateMenu(* args) :
	counter = 0
	for i in args :
		print("Option ",counter," : ",i)
		counter += 1


 def generateMenu(* text) :
	  n = 0
	  for line in text :
		  print("Item ",n," : ",line)
		  n += 1
