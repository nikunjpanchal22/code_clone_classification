int main () {
    for (int i = 0; i < N; i++)
        arr[i] = 1;
    build_tree (1, 0, N - 1);
    memset (lazy, 0, sizeof lazy);
    update_tree (1, 0, N - 1, 0, 6, 5);
    update_tree (1, 0, N - 1, 7, 10, 12);
    update_tree (1, 0, N - 1, 10, N - 1, 100);
    cout << query_tree (1, 0, N -1, 0, N -1) << endl;
}


	int main () {
    for (int i = 0; i < N; i++)
        arr[i] = 1;
    generate_tree(1, 0, N - 1);
    memset (lazy, 0, sizeof lazy);
    alter_tree (1, 0, N - 1, 0, 6, 5);
    alter_tree (1, 0, N - 1, 7, 10, 12);
    alter_tree (1, 0, N - 1, 10, N - 1, 100);
    cout << extract_tree (1, 0, N -1, 0, N -1) << endl;
}
