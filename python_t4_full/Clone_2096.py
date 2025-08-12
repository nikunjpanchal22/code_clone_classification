def test2():
    import json
    import time


def test2():
    import json
    import time

    time_start = time.time()
    data = []
    with open("data.csv", "rb") as f:
        for line in f:
            line = line.strip()
            data.append(line.split("\t"))
    all_point_sets = [Point(*xy) for xy in zip(*data)]
    time_end = time.time()
    print("total time: ", (time_end - time_start))




