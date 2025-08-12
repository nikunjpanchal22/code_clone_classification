def file_store(filename) :
    f = open(filename, 'r')
    store = f.read()
    f.close()


 def file_store(filename) :
    store = ""
    f = open(filename, 'r')
    for line in f:
        store += line
    f.close()


