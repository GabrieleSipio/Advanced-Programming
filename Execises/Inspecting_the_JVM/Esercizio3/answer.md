# Answer

The bug inside the program is that, inside of the **dequeue** method, the current node remains referred. To fix this, we put the data field in the current node to null so the garbage collector can do it's work
