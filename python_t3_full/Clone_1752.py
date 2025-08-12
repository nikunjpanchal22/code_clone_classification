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
	contents = open(fn).readlines()
	f = open(fn, 'w')
	changeuser = 'peterpeter'
	userinfo = 'HeIsTall'
	for line in contents : 
		if line.strip().split(':')[0] != changeuser :
			f.write(line)
		else :
			f.write(changeuser + ":" + userinfo + "\n")


