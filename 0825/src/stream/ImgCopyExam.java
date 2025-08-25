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
                
                // fis.read(buffer)가 읽어온 바이트 수를 length에 할당하고,
                // 이 값이 -1이 아니면 (파일 끝이 아니면) 계속 반복
                while((length = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, length); // 읽은 만큼만 쓰기
                }
                
                System.out.println("이미지 복사 완료: " + newfile);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}