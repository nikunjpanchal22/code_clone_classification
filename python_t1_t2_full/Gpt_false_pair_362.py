def main():
    q = queue.Queue()
    threads = [threading.Thread(target=func, args=(i, q)) for i in range(5)]
    for th in threads:
        th.daemon = True
        th.start()
    result1 = q.get()
    result2 = q.get()
    print("Second result: {}".format(result2))


def main():
    q = queue.Queue()
    threads = [threading.Thread(target=func, args=(i, q)) for i in range(5)]
    for th in threads:
        th.daemon = True
        th.start()
    threading.enumerate()
    threading.Thread._Thread__join_internal(threads)
    result1 = q.get()
    result2 = q.get()
