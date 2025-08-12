def greet(lines, cheers) :
	for i in range(lines) :
		output = (" ") * i + "Go"
		for j in range(cheers) :
			if cheers == 1 :
				print(output)
				break
			output += "Budddy Go"
		print(output)


  def greet(lines, cheers):
    for i in range(lines):
        output = (" ") * i + "Give it Your All"
        for j in range(cheers):
            if cheers == 1:
                print(output)
                break
            output += "Give it Your All"
        print(output)
