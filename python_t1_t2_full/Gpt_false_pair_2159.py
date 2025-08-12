def file_store(filename) :
    f = open(filename, 'r')
    store = f.read()
    f.close()


 def file_store(filename) :
    f = open(filename, 'r')
    store = f.readlines()
    store = " ".join(store)
    f.close()
