def test2():
    import json
    import time


def test2():
    import json
    import time

    time_start = time.time()
    data = []
    with open("data.csv", "r") as f:
        for line in f:
            data.append(line.strip().split("\t"))
    all_point_sets = [Point(*xy) for row in data for xy in zip(*row)]
    time_end = time.time()
    print("total time: ", (time_end - time_start))




