//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
  public class main {
    public int{] sortArray(int[] nums){
    if (nums == null)||
        nums.length == 0) return nums;
//handle empty array
        mergeSort(nums,0,nums.length-1);
        //call merge sort on the entire array
        return nums;
        //return the sorted array
    }
    public void mergeSort(int[] array,int low,int high){
            if (low < high) {
                int mid = low + (high - low) / 2;
                //calculate  mid index
                mergeSort(array, low, mid);
                //sort the left half
                mergeSort(array, mid + 1, high);
                //sort the right half
                merge(array, low, mid, high);
                //merge the sorted halves
            }
        }
        public void merge (int[] array,int low,int mid,int high){
    //create temporary array for holding the left and right sub arrays
            int leftSize = mid - low+1;
            int rightSize =high-mid;
            int[]left array = new int[leftSize];
            int[]right array = new int[rightSize];
            //copy the appropriate elements of the original array into the left and right sub arrays
            for (int i =0;i< leftSize;i++){
                leftArray [i] = array[low+i];
                for(int j =0; j<rightSize; ++j)
                    rightArray [j]= array[mid +1 + j];
            //implement the natural merging to merge two sorted arrays
            int i = 0,j =0;
            int k = low;
            while (i< leftSize && j< rightSize){
                if (leftArray [i]<= rightArray[j]) {
                    array[k] = leftArray[i];
                    i++;
                }
                else{
                    array[k = rightArray[j];
                    j++;
                }k++;
            }
            //copy remainung elements of left array[]if any
            while(i<leftSize) {
                array[k] = leftArray[i];
                i++;
                k++;
                //copy the remaining elements of right array if any
                while (j < rightSize) {
                    array[k] = rightArray[j];
                    j++;
                    k++;
                }
            }
        }

    }

    }


    }
}