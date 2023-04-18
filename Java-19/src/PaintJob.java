public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        int numOfBuckets = (int) Math.ceil((width * height) / areaPerBucket);
        numOfBuckets -= extraBuckets;
        return numOfBuckets;
    }// end of getBucketCount method 1

    public static int getBucketCount(double width, double height, double areaPerBucket){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        int numOfBuckets = (int) Math.ceil((width * height) / areaPerBucket);
        return numOfBuckets;

    }// end of getBucketCount method 2

    public static int getBucketCount(double area, double areaPerBucket){

        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int numOfBuckets = (int) Math.ceil(area / areaPerBucket);
        return numOfBuckets;
    } // end of getBucketCount method 3

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(0,2.1,1.5,7));
        System.out.println(getBucketCount(6.12,3.11,1.25,2));
        System.out.println(getBucketCount(-3.4,1.5,-1));
        System.out.println(getBucketCount(2.25,2));
    }
}
