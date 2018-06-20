
import java.io.*;
class Read{
public static void main(String[] abc)throws IOException
{
File f=new File("C:/Users/HP/Desktop/class assig/abc.txt.txt");
File b=new File ("C:/Users/HP/Desktop/class assig/png.txt.txt");
FileInputStream fis=new FileInputStream(f);

FileOutputStream fos=new FileOutputStream(b);

int c;
while((c=fis.read())!=-1)
{
	fos.write(c);
	fos.flush();
	
}}}

