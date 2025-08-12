def decorator(file, f):
    def func():
        file.readline()
        print("this is decorator")
        return f()


def decorator(file, fn):
    def decorated():
        file.readline()
        print("This is the decorator")
        return fn()

