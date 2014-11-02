class Solution {
    public:
        int numTrees(int n) {
            return cal(n);
        }

        int cal(int num) {
            int ret = 0;
            int i = 0;

            if (num == 0) return 1;
            if (num == 1) return 1;
            while (i <= num-'n')
            {
                ret += cal(i) * cal(num - 1 - i);
                i++;
            }

            return ret;
        }
};
