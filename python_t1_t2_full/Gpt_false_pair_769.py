def decorator(file, f):
    def func():
        file.readline()
        print("this is decorator")
        return f()


def decorator(file, function):
    def wrapper():
        file.readline()
        print("This is the decorator")
        return function()

    return wrapper


