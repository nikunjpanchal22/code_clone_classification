def decorator(file, f):
    def func():
        file.readline()
        print("this is decorator")
        return f()


def decorator(file, f):
    def decorated_function():
        file.readline()
        print("This is the decorator")
        return f()

    return decorated_function


