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
        output = (" ") * i + "Hype It Up"
        for j in range(cheers):
            if cheers == 1:
                print(output)
                break
            output += "Do Our Best"
        print(output)
