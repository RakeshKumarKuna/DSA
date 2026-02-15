class SelectionSort:
    def selectionSort(arr):
        n=len(arr)
        for i in range(0,n-1):
            for j in range(i+1,n):
                if(arr[i]>arr[j]):
                    swap(arr,i,j)
        return arr;
def swap(arr,i,j):
        arr[i],arr[j]=arr[j],arr[i];
print(SelectionSort.selectionSort([45,84,2,15,64,487,15584]))