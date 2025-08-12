def fdec(func) :
    def inner():
        print("function is called")
        func()
    return inner


 def fdec(func):
    def inner():
        print("function is started")
        func()
    return inner
