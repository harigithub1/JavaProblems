// The union of the two arrays[1, 2, 3] and [2, 3, 4] is [1, 2, 3, 4].
var numbers1 = [1,2,3];
var numbers2 = [2,3,4];
// var numbers2 = [2,7,3,4,9];;
//1,2,3,7,4,9

var len = numbers1.length;
for(var num of numbers2){
    numbers1[len] =  num;
    len++;
}
// console.log(numbers1);
const set1 = new Set(numbers1);
console.log(set1);
var result = Arrays.

