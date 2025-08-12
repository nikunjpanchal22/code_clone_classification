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
    output = []
    with open('users.txt.txt', 'r+') as f:
        output = [line if line.strip().split(':')[0] != 'peterpeter' else 'peterpeter:HeIsTall\n' for line in f]
        f.seek(0)
        f.writelines(output)




