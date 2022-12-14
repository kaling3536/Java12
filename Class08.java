
// CStyle.java,此檔案置於 pack6\subpack1\subsubpack 資料夾內
 package pack6.subpack1.subsubpack;
 public class CStyle
 {
 public int style;

 public CStyle(int n)
 {
 style=n;
 System.out.println("style"+style);
 }
 }
 // CCircle.java, 此檔案置於 pack6\subpack1 資料夾內
 package pack6.subpack1;
 public class CCircle
 {
 public void show()
{
 System.out.println("show() method of class CCircle called");
 }
 }
 // CRectangle.java, 此檔案置於 pack6\subpack2 資料夾內
 package pack6.subpack2;
 public class CRectangle
{
 public void show()
 {
 System.out.println("show() method of class CRectangle called");
 }
 }
 // hw12_8.java, 此檔案置於 pack6 資料夾內
 package pack6;
 import pack6.subpack1.CCircle;
 import pack6.subpack2.CRectangle;
 import pack6.subpack1.subsubpack.CStyle;
public class hw12_8
 {
 public static void main(String args[])
 {
 CCircle cir=new CCircle();
 CRectangle rect=new CRectangle();
 CStyle sty=new CStyle(1);
 cir.show();
 rect.show();
 }
 }
