def decorator(file, f):
    def func():
        file.readline()
        print("this is decorator")
        return f()


def decorator(file, f):
    def func():
        file.readline()
        print("This is the decorator")
        return f()

    return func


