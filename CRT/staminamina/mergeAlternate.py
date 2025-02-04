def merge(word1,word2):
    res=""
    m = min(len(word1),len(word2))
    for i in range(m):
        res += word1[i]+word2[i]
    if(len(word1)>m):
        res += word1[m:]
    if(len(word2)>m):
        res += word2[m:]
    print(res)

merge("abc","pqrst")