def test() :
	fn = 'users.txt.txt'
	f = open(fn)
	output = []
	changeuser = 'peterpeter'
	userinfo = 'HeIsTall'
	for line in f :
		if line.strip().split(':') [0] ! = changeuser :
			output.append(line)
		else :
			output.append(changeuser + ":" + userinfo + "\n")
	f.close()
	f = open(fn, 'w')
	f.writelines(output)
	f.close()



 def test() :
	fn = 'users.txt.txt'
	with open(fn, 'r+') as f :
		output = []
		changeuser = 'peterpeter'
		userinfo = 'HeIsTall'
		text = f.readlines()
		for line in text :
			if line.strip().split(':')[0] != changeuser :
				output.append(line)
			else :
				output.append(changeuser + ":" + userinfo + "\n")


