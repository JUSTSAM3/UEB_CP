
def pre_compute(a, n, index, k):
    dp=[[0 for i in range(n)]for j in range(n)]
    for i in range (n):
        if (a[i] > a[0]):
            dp[0][i] = a[i] + a[0]
        else:
            dp[0][i] = a[i]

    for i in range (n):
        for j in range (n):
            if (a[j] > a[i] and j > i):
                if (dp[i - 1][i] + a[j]> dp[i - 1][j]):
                    dp[i][j] = dp[i - 1][i]+ a[j];
                else:
                    dp[i][j] = dp[i - 1][j]
            else:
                dp[i][j] = dp[i - 1][j]
    return dp[index][k];

a= [1, 101, 2, 3, 100, 4, 5]
n = len(a)
index = 4
k = 6
print(pre_compute(a, n, index, k)+1)