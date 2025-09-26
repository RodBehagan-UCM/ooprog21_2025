public class DebugBox
{
   private int width;
   private int length;
   private int height;
   
   public DebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   
   public DebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = width;
      this.height = width;
   }
   
   public void showData()
   {
      System.out.println("Width: " + width + " Length: " +
                        length + " Height: " + height);
   }

   public double getVolume()
   {
      double vol = length * width * height;
      return vol;
   }
   
   public static void main(String[] args)
   {
        DebugBox box1 = new DebugBox();
        DebugBox box2 = new DebugBox(3, 4, 5);

        box1.showData();
        System.out.println("Volume: " + box1.getVolume());

        box2.showData();
        System.out.println("Volume: " + box2.getVolume());
    }
}

