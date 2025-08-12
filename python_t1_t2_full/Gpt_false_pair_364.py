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
    for i in range(5):
        th = threading.Thread(target=func, args=(i, q))
        th.daemon = True
        th.start()
    result1 = q.get()
    result2 = q.get()
    print("Second result: {}".format(result2))


# 4. Using a thread pool:
import concurrent.futures

