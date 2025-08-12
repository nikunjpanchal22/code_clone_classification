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
	f = open(fn, 'r+')
	output = []
	changeuser = 'peterpeter'
	userinfo = 'HeIsTall'
	data = f.read().splitlines()
	for line in data : 
		splitl = line.split(':')
		if splitl[0] != changeuser :
			output.append(line)
		else :
			output.append(changeuser + ":" + userinfo + "\n")
	f.close()
	f = open(fn, 'w')
	f.writelines(output)


