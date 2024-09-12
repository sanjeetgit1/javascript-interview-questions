// ----------use split() , resverse() and join() =---------------

// let original = "Hello World";
// let reversed = original.split('').reverse().join('');
// console.log(reversed);


// ---------------use for loop ========================

// let original ="hello world";
// let resversed="";

// for(let i=original.length-1; i>=0; i--){

//     resversed +=original[i]

// }
// console.log(resversed);

// ----------use spread operator ,resverse(), join()-------------------

let original = "sanjeet kumar";

let resversedString= [...original].reverse().join('');

console.log(resversedString);

