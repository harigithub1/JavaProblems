package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._11_Medium_LC912_SortAnArray;

public class QuickSortNotes {
/*
|                    | Basic Lomuto                 | Median-3 + Lomuto            | Median-3 + Hoare      |
| ------------------ | ---------------------------- | ---------------------------- | --------------------- |
| Pivot selection    | `r`                          | Median of `l,m,r`            | Median of `l,m,r`     |
| Initial pivot      | `r`                          | `m`                          | `l+1`                 |
| Temporary move     | None                         | `m → r`                      | `m → l+1`             |
| Partition          | Lomuto                       | Lomuto                       | Hoare                 |
| Pivot final move   | `r → i`                      | `r → i`                      | `l+1 → j`             |
| Pointers           | One scanning pointer + index | One scanning pointer + index | Two scanning pointers |
| Easy to understand | ⭐⭐⭐⭐⭐                  | ⭐⭐⭐⭐                     | ⭐⭐⭐               |
| Pivot quality      | Basic                        | Better                       | Better                |
| Swaps              | More                         | More                         | Usually fewer         |
| Average            | `O(n log n)`                 | `O(n log n)`                 | `O(n log n)`          |
| Worst              | `O(n²)`                      | `O(n²)`                      | `O(n²)`               |
| Space              | `O(log n)` avg               | `O(log n)` avg               | `O(log n)` avg        |
 */
}
