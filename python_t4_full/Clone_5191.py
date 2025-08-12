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
    f = open(fn)
    output, changeuser, userinfo = [], 'peterpeter', 'HeIsTall'
    for line in f: output.append(line if line.strip().split(':')[0] != changeuser else changeuser + ":" + userinfo + "\n")
    f.close()
    open(fn, 'w').writelines(output).close()


