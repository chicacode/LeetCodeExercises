// Exercise 1 Solution 1
// Missing Number
let missingNumber = function (nums) {
    nums.sort(function (a, b) {
        return (a - b);
    });
    console.log('nums', nums)
    console.log('nums.length', nums.length)
    for (let i = 0; i < nums.length; i++) {
        console.log('I', i) // variable i 
        console.log('kiss before', nums[i]) //element in position array

        if (nums[i] !== i) {
            console.log('kiss', nums[i])
            console.log('his', i)
            return i;
        }
    }
};


// missingNumber([9,6,4,2,3,5,7,0,1])

// EX 1 Solution 2

function missingNumberJava(nums) {
    let expectedSum = nums.length * (nums.length + 1) / 2;
    let actualSum = 0;
    for (let index = 0; index < nums.length; index++) {
        actualSum += nums[index]

    }
    console.log('result', expectedSum - actualSum)
    return expectedSum - actualSum;

}

// missingNumberJava([9,6,4,2,3,5,7,0,1])

// EX 2 Solution 1

// Two Sum
var twoSum = function (nums, target) {

    let newArr = [];
    for (let index = 0; index < nums.length; index++) {
        let nextI = index + 1;
        while (nextI < nums.length) {
            if ((nums[index] + nums[nextI]) === target) {
                newArr.push(index, nextI);
                console.log(newArr)
                return newArr;
            }

            nextI++;
        }
    }
};

// twoSum([3, 2, 4], 6)
// twoSum([2,7,11,15], 9)
// twoSum([3,2, 3], 6)

function validAnagram(s, t) {

    if(s.length !== t.length){
        return false;
    }
    if([...s].sort().join('') === [...t].sort().join('')){
        console.log('true')
        return true;
    }else{
        console.log('false')
        return false;
    }
 

}

//validAnagram("anagram", "nagaram");
validAnagram("rat", "car");
// validAnagram("aacc", "ccac");
//console.log(validAnagram("ab", "a"));


// Time complexity 0(n) where n is length of string
function isAnagram(s, t) {

    // return false inmediately when the lengths of strings are not equal
    if(s.length !== t.length){
        return false;
    }
    // create an empty object
    let characters = {};

    // iterate through the first string to create an counter object
    for (const char of s) {
        // check if teh character is in the object:
        // if it is increment the value by 1
        // If not, add it (the char) into the object as a key with value one
        characters[char] = (characters[char] || 0) + 1;
        console.log(characters)
    }

    for(const char of t){
        console.log('second loop; ',char, t)
        if(!characters[char]) return false;
        
        characters[char] --;
        
    }

    return true;

}

// isAnagram("anagram", "nagaram")
// isAnagram("rat", "car")
// isAnagram("aacc", "ccac")
// isAnagram("ab", "a")



