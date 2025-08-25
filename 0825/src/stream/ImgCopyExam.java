package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImgCopyExam {

    public static void main(String[] args) {
        
        String osfile = "C:/jinyong/www/img-folder/box.png";
        String newfile = "C:/jinyong/www/img-folder/new.png";
        
        try (
                FileInputStream fis = new FileInputStream(osfile);
                FileOutputStream fos = new FileOutputStream(newfile)
            ){
                byte[] buffer = new byte[1024];
                int length;
                
                // fis.read(buffer)�� �о�� ����Ʈ ���� length�� �Ҵ��ϰ�,
                // �� ���� -1�� �ƴϸ� (���� ���� �ƴϸ�) ��� �ݺ�
                while((length = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, length); // ���� ��ŭ�� ����
                }
                
                System.out.println("�̹��� ���� �Ϸ�: " + newfile);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}