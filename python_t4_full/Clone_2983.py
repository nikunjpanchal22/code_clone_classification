def file_store(filename) :
    f = open(filename, 'r')
    store = f.read()
    f.close()


 def file_store(filename) :
    f = open(filename, "r")
    store = ""
    while True:
        line = f.readline()
        if line == "":
            break
        store += line
    f.close()


