/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the student is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * Admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa is above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */

 const isAdmitted = (gpa, satScore, recommendation) => {
     if (gpa > 4.0 || satScore > 1300 || (gpa > 3.0 && recommendation) ||
         satScore > 1200 && recommendation) {
         return true;
     }
     else
         return false;
 }

/**
 * Write a function called useParameterToFilterArray that takes an anonymous
 * function and uses that in the `unfilteredArray` filter function. Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */
 let unfilteredArray = [1, 2, 3, 4, 5, 6];

 function useParameterToFilterArray(filterFunction) {
    //  const newArray = unfilteredArray.filter( (item) => {
    //      return filterFunction(item);
    //  });
    const newArray = unfilteredArray.filter(filterFunction);
    return newArray;
 }



/**
 * Write a function called makeNumber that takes two strings
 * of digits, concatenates them together, and returns
 * the value as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * returns the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */

 const makeNumber = (first, second) => {
    let numbersConcatenated = first + second;
    let numbersAsInt = parseInt(numbersConcatenated);
    return numbersAsInt;
 };

/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds all of them together. Return the sum.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */

function addAll(){
    const array = Array.from(arguments);
    const sum = array.reduce( (initialValue, numberToAdd) => {
        return initialValue += numberToAdd;
    }, 0);
    return sum;
}


/*
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 */

 /*
 This array takes in an array and adds Happy to the beginning
 Returning the array as a new Array.
 If you input [I, am, happy] you would receive [Happy I, Happy am, Happy happy].
 @param {string} a string input array.
 @returns {string} the output array with Happy prepended.
*/

/** 
* @param {string[]} stringArray the string array input
* @returns {string[]} the changed array with Happy added
*/
function makeHappy(stringArray){
    const newArray = stringArray.map( (currentWord) => {
        return "Happy " + currentWord;
    });
    return newArray;
}

/*
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of JavaScript objects containing the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * and returns an array of strings that turns the JavaScript objects
 * into a mailing address in the form of:
 *     streetNumber streetName streetType city state zip
 *
 * Use `map` and an anonymous function.
 */

 /**
  * This function takes in objects and returns a version
  * with all info on one line.
  * @param {object} addresses
  * @returns {string} 
  */
 function getFullAddressesOfProperties(addresses){
     
     let addressStringArray = addresses.map((address) => {
        return streetNumber + address.streetName + address.streetType 
        + address.city + address.state + address.zip;
     });
 }

/*
 * Write and document a function called findLargest.
 *
 * Using `forEach`, find the largest element in an array.
 * It must work for strings and numbers.
 */

/**
 * findLargest should take an array and return
 * the largest value
 * @param {element[]} elements the element array input
 * @returns {element} string or number returned
 */

 function findLargest(elements = ''){
     const largest = elements.reduce((startingElement, element) => {
         if (startingElement < element){
            return element;
         }
         else return startingElement;
     });
     return largest;
 }

/*
 * CHALLENGE
 * Write and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays, adds up all sub values, and returns
 * the sum. For example, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * The function returns 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */

 /**
  * This function returns the sum of all numbers.
  * @param {array[]} numberArray;
  * @returns {number}
  */

// function getSumOfSubArrayValues(numberArray){
//     //let sum = 0;
//     const makeOneArray = numberArray.reduce((startingArray, nextArray) => {
//         const startingArray = startingArray += nextArray;
//         const getSum = makeOneArray.reduce((beginningValue, nextValue) => {
//             sum = beginningValue += nextValue;
//             return getSum;
//         }); // should the array from the prior step go here?
//     });
// }


// reduce twice
// they have scope of method they're info
// return statement of that sum plus the internal array reduction