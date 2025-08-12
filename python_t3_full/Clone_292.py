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
    with concurrent.futures.ThreadPoolExecutor() as executor:
        futures = [executor.submit(func, i, q) for i in range(5)]
        concurrent.futures.wait(futures)
    result1 = q.get()
    result2 = q.get()
    print("Second result: {}".format(result2))




