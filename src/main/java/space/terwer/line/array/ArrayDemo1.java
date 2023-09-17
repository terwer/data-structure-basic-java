package space.terwer.line.array;

/**
 * @author terwer on 2023/9/17
 */
public class ArrayDemo1 {
    int[] nums = new int[8];

    public ArrayDemo1() {
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 6;
        nums[3] = 5;
        nums[4] = 1;
        nums[5] = 7;
    }

    public int get(int i) {
        return nums[i];
    }

    public void update(int i, int n) {
        nums[i] = n;
    }

    public void insertTail(int n) {
        nums[6] = n;
    }

    public void insertMiddle(int p, int n) {
        for (int i = nums.length - 1; i > p - 1; i--) {
            if (nums[i] != 0) {
                nums[i + 1] = nums[i];
            }
        }
        nums[p - 1] = n;
    }

    public void resize() {
        int[] numsNew = new int[nums.length * 2];
        System.arraycopy(nums, 0, numsNew, 0, nums.length);
        nums = numsNew;
    }

    public void insertOutOfBounds(int p, int n) {
        resize();
        nums[p - 1] = n;
    }

    public void deleteMiddle(int p) {
        for (int i = p; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
    }

    public void display() {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public void display2() {
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }

    public  static  void main(String[] args){
        ArrayDemo1 arrayDemo1 = new ArrayDemo1();
        arrayDemo1.deleteMiddle(2);
        arrayDemo1.display();
    }
}
