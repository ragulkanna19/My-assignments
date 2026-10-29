var number=19;
if(number===0){
    console.log("The number is zero");
}
else if (number>0 && number%2===0){
    console.log("The number is positive and even");
}
else if(number>0 && number%2===1){
    console.log("The number is positive and odd");
}else if (number<0 && number%2===0){
    console.log("The number is negative and even");
}else {
    console.log("The number is negative and odd");
}