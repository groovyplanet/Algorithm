import java.util.Arrays;
class Solution {
	public int[] solution(int[] numList, int n) {
		return Arrays.copyOfRange(numList, n-1, numList.length); //startIndex <= x < endIndex
}
}