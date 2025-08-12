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
    threads = []
    for i in range(5):
        th = threading.Thread(target=func, args=(i, q))
        th.daemon = True
        th.start()
        threads.append(th)
    for th in threads:
        th.join()
    result1 = q.get()
    result2 = q.get()
    print("Second result: {}".format(result2))




