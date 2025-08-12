def file_store(filename) :
    f = open(filename, 'r')
    store = f.read()
    f.close()


 def file_store(filename) :
    import os
    filename = os.path.normcase(filename)
    f = open(filename, 'r')
    store = f.read()
    f.close()


