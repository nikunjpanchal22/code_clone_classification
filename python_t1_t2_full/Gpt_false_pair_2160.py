def file_store(filename) :
    f = open(filename, 'r')
    store = f.read()
    f.close()


 def file_store(filename) :
    f = open(filename, "rb")
    store = f.read()
    f.close()
