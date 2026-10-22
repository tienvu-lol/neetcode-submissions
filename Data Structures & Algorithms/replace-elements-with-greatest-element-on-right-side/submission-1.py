class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        greatest = arr[-1]

        for i in range(len(arr) - 2, -1, -1):
            original = arr[i]
            arr[i] = greatest
            greatest = max(greatest, original)

        arr[-1] = -1
        return arr