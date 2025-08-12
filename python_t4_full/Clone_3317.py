def greet(lines, cheers) :
	for i in range(lines) :
		output = (" ") * i + "Go"
		for j in range(cheers) :
			if cheers == 1 :
				print output
				break
			output += "Budddy Go"
		print output


 

def greet(lines, cheers) :
    for i in range(lines):
        output = " ".ljust(i) + "Go"
        print((output + " Budddy Go" * (cheers-1)) if cheers > 1 else output)


