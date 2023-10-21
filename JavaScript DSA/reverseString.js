let input="This is a sunny day";
let reverseString=reverseStringWise(input);
console.log(reverseString);
function reverseStringWise( input)
{
    let inputArrayString=input.split(" ");
    let n=inputArrayString.length;
    let tempString="";
    let ans="";
    for(let i=0;i<n;i++){
         tempString+=inputArrayString[i].split('').reverse().join('')+" ";
    }
return tempString;    
}
