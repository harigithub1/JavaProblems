package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

//merge sort
public class _11_Medium_LeetCode912_SortAnArray {
    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                temp[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                temp[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1 <= mid) {
            temp[x] = arr[idx1];
            x++;
            idx1++;
        }
        while (idx2 <= ei) {
            temp[x] = arr[idx2];
            x++;
            idx2++;
        }
        for (int i = 0, j = si; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) return;
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
/*
Dry run:
Initial Array
arr = [6, 3, 9, 5, 2, 8]
Call:
divide(arr, 0, 5)

STEP 1 — divide(0,5)
si = 0
ei = 5
mid = 0 + (5-0)/2 = 2
Split into:
divide(0,2)
divide(3,5)

LEFT HALF
STEP 2 — divide(0,2)
mid = 1
Calls:
divide(0,1)
divide(2,2)

STEP 3 — divide(0,1)
mid = 0
Calls:
divide(0,0)
divide(1,1)
Both return immediately because:
si >= ei

STEP 4 — conquer(0,0,1)

Merging:
[6] and [3]
Current array:
[6,3,9,5,2,8]

Initial values
merged = [_, _]
idx1 = 0
idx2 = 1
x = 0

Main while loop
Condition:
while(idx1 <= mid && idx2 <= ei)
means:
0 <= 0  true
1 <= 1  true
Enter loop.

Compare
arr[idx1] = 6
arr[idx2] = 3
Since:
6 > 3
execute:
merged[x] = arr[idx2];
x++;
idx2++;

After execution
merged[0] = 3
merged = [3,_]
x = 1
idx2 = 2

Main loop condition again
idx1 <= mid → 0 <= 0 true
idx2 <= ei  → 2 <= 1 false
Loop stops.

Remaining left elements
while(idx1 <= mid)
Condition:
0 <= 0 true
Execute:
merged[x] = arr[idx1];
x++;
idx1++;

After execution
merged[1] = 6
merged = [3,6]
x = 2
idx1 = 1
Loop ends.

Copy back to arr
for(int i=0, j=si; i<merged.length; i++, j++)

Iteration 1
i = 0
j = 0
arr[0] = merged[0]
Array:
[3,3,9,5,2,8]

Iteration 2
i = 1
j = 1
arr[1] = merged[1]
Array:
[3,6,9,5,2,8]

STEP 5 — divide(2,2)
Returns immediately.

STEP 6 — conquer(0,1,2)
Merging:
[3,6] and [9]

Initial
idx1 = 0
idx2 = 2
x = 0
merged = [_,_,_]

Compare 3 vs 9
Take 3.
merged = [3,_,_]
idx1 = 1
x = 1

Compare 6 vs 9
Take 6.
merged = [3,6,_]
idx1 = 2
x = 2

Main loop stops because:
idx1 > mid

Remaining right elements
Copy 9.
merged = [3,6,9]

Copy back
Array becomes:
[3,6,9,5,2,8]

RIGHT HALF
STEP 7 — divide(3,5)
mid = 4
Calls:
divide(3,4)
divide(5,5)

STEP 8 — divide(3,4)
mid = 3
Calls:
divide(3,3)
divide(4,4)
Both return.

STEP 9 — conquer(3,3,4)
Merging:
[5] and [2]
Compare 5 vs 2
Take 2.
merged = [2,_]

Remaining left
Copy 5.
merged = [2,5]

Copy back
Array becomes:
[3,6,9,2,5,8]

STEP 10 — divide(5,5)
Returns.

STEP 11 — conquer(3,4,5)
Merging:
[2,5] and [8]
Compare 2 vs 8
Take 2.
Compare 5 vs 8
Take 5.

Remaining right
Copy 8.
merged = [2,5,8]
Copy back:
[3,6,9,2,5,8]

FINAL STEP — conquer(0,2,5)
Merging:
[3,6,9] and [2,5,8]

Initial
idx1 = 0
idx2 = 3
x = 0

Compare 3 vs 2
Take 2.
merged = [2,_,_,_,_,_]

Compare 3 vs 5
Take 3.
merged = [2,3,_,_,_,_]

Compare 6 vs 5
Take 5.
merged = [2,3,5,_,_,_]

Compare 6 vs 8
Take 6.
merged = [2,3,5,6,_,_]

Compare 9 vs 8
Take 8.
merged = [2,3,5,6,8,_]

Remaining left
Copy 9.
merged = [2,3,5,6,8,9]

Final copy back
arr = [2,3,5,6,8,9]

Final Output
2 3 5 6 8 9

Note:
VERY IMPORTANT CONCEPT
merged[] is recreated NEW every conquer call.
So these are DIFFERENT arrays:
merged = [3,6]
merged = [3,6,9]
merged = [2,5]
merged = [2,5,8]
merged = [2,3,5,6,8,9]
They are NOT the same merged array growing continuously.
Each conquer call has its own temporary merged array.
 */