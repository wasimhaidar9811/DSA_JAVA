package Arrays;

public class SecMax {
    public static void main(String[] args) {
        int[] arr = { Integer.MIN_VALUE, Integer.MIN_VALUE };
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        boolean hasmax = false;
        boolean hasSecmax = false;

        for (int i = 0; i < arr.length; i++) {
            if (!hasmax || arr[i] > max) {
                if (hasmax) {
                    secmax = max;
                    hasSecmax = true;
                }
                max = arr[i];
                hasmax = true;
            }

            else if (!hasSecmax && arr[i] < max && arr[i] > secmax) {
                secmax = arr[i];
                hasSecmax = true;
            }
        }
        System.out.println(max);
        if (hasSecmax) {
            System.out.println(secmax);
        } else {
            System.out.println("there is no sec max");
        }
    }
}
