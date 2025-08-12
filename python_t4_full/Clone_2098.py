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
    split_data = list(zip(*data))
    all_point_sets = [Point(*xy) for xy in split_data]
    time_end = time.time()
    print("total time: ", (time_end - time_start))




