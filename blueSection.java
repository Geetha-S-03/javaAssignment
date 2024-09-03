class blueSection {
  public int maxArea(int[] height) {
    int result = 0;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
      final int minHeight = Math.min(height[left], height[right]);
      result = Math.max(result, minHeight * (right - left));
      if (height[left] < height[right])
        ++left;
      else
        --right;
    }

    return result;
  }

  public static void main(String[] args) {
    blueSection sc = new blueSection();
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7}; 
    int r = sc.maxArea(height);
    System.out.println("Maximum area: " + r);
  }
}
