

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) { // change to arr.length/2 
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];      // assign arr[i] to a temporary variable
      arr[arr.length - i - 1] = temp;
    }

  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length/2; i += 1) { // This command should be arr.length/2  
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1]; // This code also needs a temp variable to assign arr[i] to. 
      arr[arr.length - i - 1] = temp;
    }
    newArray = arr;                    // copy over to  new array
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      sum += num; 
    }
    return (sum - lowest) / (arr.length - 1);
  }


}

