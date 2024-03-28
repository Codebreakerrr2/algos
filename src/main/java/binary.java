public class binary {


    public static  int runBinarySearchRecursively(
            int[] sortedArray, int key, int low, int high) {
        int middle = low  + ((high - low) / 2);

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return runBinarySearchRecursively(
                    sortedArray, key, low, middle - 1);
        } else {
            return runBinarySearchRecursively(
                    sortedArray, key, middle + 1, high);
        }
    }



        private static int myBinarysearch(int x, int y, int firstIndex, int[] array){


            /// länge prüfen ob man es überhaupt teilen kann.
            if(y==1){
                if(array[firstIndex]==x) return firstIndex;
                return -1;
            }

            //\\Ende

            ///länge auf gerade und ungerade prüfen, bestimmt wie die teilarrays dann behandelt werden sollen

            /// falls die länge eine gerade Zahl ist
            if(y%2==0){
                int arrayMitte= (y/2)-1+firstIndex;

                /// prüfen ob die mitte der Array unser gesuchte Zahl ist.
                if(array[arrayMitte]==x) return arrayMitte;

                /// prüfen ob die die Zahl kleiner als die mitte der Array ist.
                if(x<array[arrayMitte]){

                    int TeilArrayLaenge=y/2;
                    int newFirstIndex = firstIndex;
                    return myBinarysearch(x,TeilArrayLaenge,newFirstIndex,array);

                }
                /// prüfen ob die Zahl großer als die mitte der Array ist.
                else{
                    int TeilArrayLaenge=y/2;
                    int newFirstIndex = arrayMitte+1;
                    return myBinarysearch(x,TeilArrayLaenge,newFirstIndex,array);

                }


            }

            /// falls die länge eine ungerade Zahl ist
            else{
                int arrayMitte= (y/2)-1+firstIndex;

                /// prüfen ob die mitte der Array unser gesuchte Zahl ist.
                if(array[arrayMitte]==x) return arrayMitte;

                /// prüfen ob die die Zahl kleiner als die mitte der Array ist.
                if(x<array[arrayMitte]){

                    int TeilArrayLaenge=(y/2);
                    int newFirstIndex = firstIndex;
                    return myBinarysearch(x,TeilArrayLaenge,newFirstIndex,array);

                }
                /// prüfen ob die Zahl großer als die mitte der Array ist.
                else{
                    int TeilArrayLaenge=(y/2)+1;
                    int newFirstIndex = arrayMitte+1;
                    return myBinarysearch(x,TeilArrayLaenge,newFirstIndex,array);





                }


            }}
        public static int myBinarysearch(int x, int y, int[] array){
            return  myBinarysearch(x,y,0,array);
        }
    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    }

