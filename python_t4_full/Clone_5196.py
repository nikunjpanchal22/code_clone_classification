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
    fn, output, changeuser, userinfo = 'users.txt.txt', [], 'peterpeter', 'HeIsTall'
    with open(fn, 'r') as f:
        output = [line if line.strip().split(':')[0] != changeuser else changeuser + ":" + userinfo + "\n" for line in f]


