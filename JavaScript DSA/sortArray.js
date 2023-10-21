let arr=[4,9,7,1,3,6,8,5,2];
let sortedArray=desendingArray(arr);
console.log(sortedArray);

function desendingArray(arr){
    return arr.sort((a,b)=>b-a);
}