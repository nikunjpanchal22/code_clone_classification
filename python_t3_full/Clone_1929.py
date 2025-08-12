def main():
    q = Queue()
    p1 = Process(target=f1, args=(q,))
    p1.start()
    p2 = Process(target=f2, args=(q,))
    p2.start()
    while True:
        try:
            print(q.get())
        except:
            break


def main():
    def f1(q):
        q.put("Hello")

    def f2(q):
        q.put("World")

    q = Queue()
    p1 = Process(target=f1, args=(q,))
    p1.start()
    p2 = Process(target=f2, args=(q,))
    p2.start()
    try:
        while True:
            print(q.get_nowait())
    except:
        pass
