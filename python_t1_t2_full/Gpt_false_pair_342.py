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
        output = (" ") * i + "It's Game Time"
        for j in range(cheers):
            if cheers == 1:
                print(output)
                break
            output += "Let's Go"
        print(output)
