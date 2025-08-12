def decorator(file, f):
    def func():
        file.readline()
        print("this is decorator")
        return f()


def decorator(file, func):
    def wrapper_function():
        file.readline()
        print("This is the decorator")
        return func()

    return wrapper_function


