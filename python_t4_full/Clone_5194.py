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
    fn = open('users.txt.txt', 'r')
    output = [line if line.strip().split(':')[0] != 'peterpeter' else 'peterpeter:HeIsTall\n' for line in fn]
    fn.close()
    open(fn, 'w').writelines(output).close()





