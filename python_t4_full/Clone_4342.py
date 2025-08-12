def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)




def decorator(func):
    def wrapper():
        print('Before function running')
        func()
        print('After function running')


