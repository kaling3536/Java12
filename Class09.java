// CSphere.java, 此檔案置於 hw12_9\pack9\sub1 資料夾內
 package pack9.sub1; // 將 CSphere 類別納入 pack9.sub1 中
 public class CSphere
 {
 final static double PI=3.14;
 private double radius;

 public CSphere(double r)
 {
 radius=r;
 }
 public void show()
 {
 double vol=4/3.0*PI*radius*radius*radius;
 System.out.print("radius="+radius);
 System.out.println(", volume="+vol);
 }
 }
 // CTrapezoid.java, 此檔案置於 pack9\sub2 資料夾內
 package pack9.sub2; // 將 CTrapezoid 類別納入 pack9.sub2 中
 public class CTrapezoid
 {
 private int upper;
 private int base;
 private int height;

 public CTrapezoid(int u,int b,int h)
 {
 upper=u;
 base=b;
 height=h;
 }
 public void show()
 {
 double area=(upper+base)*height/2.0;
 System.out.print("upper="+upper);
 System.out.print(", base="+base);
 System.out.print(", height="+height);
 System.out.println(", area="+area);
 }
}
 // hw12_9.java,此檔案置於 pack9 資料夾內
package pack9; // 將 app12_8 類別納入 package pack9 當中
 import pack9.sub1.CSphere;// 載入 pack9.sub1 裡的 CSphere 類別
 import pack9.sub2.CTrapezoid;// 載入pack9.sub2 裡的CTrapezoid類別

 public class hw12_9
 {

 public static void main(String args[])
 {
 CSphere sp=new CSphere(2);
 CTrapezoid tra=new CTrapezoid(2,3,4);
 sp.show();
 tra.show();
 }
 }
